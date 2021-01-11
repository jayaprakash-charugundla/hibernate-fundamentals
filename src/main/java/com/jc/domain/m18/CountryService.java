package com.jc.domain.m18;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class CountryService {

    @PersistenceContext
    private EntityManager em;

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

    @Transactional
    public void init() {
        for (String[] countryInitData : COUNTRY_INIT_DATA) {
            Country country = new Country(countryInitData[0], countryInitData[1]);
            em.persist(country);
        }
    }

    @Transactional
    public void clear() {
        em.createQuery("delete from Country c").executeUpdate();
    }

    public List<Country> getAllCountries() {
        return em.createQuery("select c from Country c").getResultList();
    }
}
