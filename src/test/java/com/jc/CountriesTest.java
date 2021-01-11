package com.jc;

import com.jc.domain.m18.Country;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CountriesTest {

    private EntityManagerFactory emf;
    private EntityManager em;

    private List<Country> expectedCountryList = new ArrayList<>();

    public static final String[][] COUNTRY_INIT_DATA = {
            {"Australia", "AU"},
            {"Canada", "CA"},
            {"Germany", "DE"},
            {"Italy", "IT"},
            {"Japan", "JP"},
            {"Romania", "RO"},
            {"Russian Federation", "RU"},
            {"Spain", "ES"},
            {"Switzerland", "CH"},
            {"United Kingdom", "UK"},
            {"United States", "US"}
    };

    @BeforeEach
    public void setup() {
        emf = Persistence.createEntityManagerFactory("m18");
        em = emf.createEntityManager();
        em.getTransaction().begin();
        for (String[] countryInitData : COUNTRY_INIT_DATA) {
            Country country = new Country(countryInitData[0], countryInitData[1]);
            expectedCountryList.add(country);
            em.persist(country);
        }
        em.getTransaction().commit();
    }

    @AfterEach
    public void dropDown() {
        em.close();
        emf.close();
    }

    @Test
    public void testCountryList() {
        List<Country> countries = em.createQuery("select c from Country  c").getResultList();
        assertNotNull(countries);
        for (int i = 0; i < COUNTRY_INIT_DATA.length; i++) {
            assertEquals(expectedCountryList.get(i), countries.get(i));
        }
    }
}
