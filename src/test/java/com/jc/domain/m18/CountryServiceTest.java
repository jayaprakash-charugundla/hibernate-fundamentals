package com.jc.domain.m18;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static com.jc.domain.m18.CountryService.COUNTRY_INIT_DATA;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:application-context.xml")
class CountryServiceTest {

    @Autowired
    private CountryService countryService;

    private List<Country> expectedCountries = new ArrayList<>();

    @BeforeEach
    public void setUp() {
        countryService.init();
        initExpectedCountries();
    }

    @Test
    public void testCountries() {
        List<Country> countries = countryService.getAllCountries();
        assertNotNull(countries);
        assertEquals(COUNTRY_INIT_DATA.length, countries.size());
    }

    private void initExpectedCountries() {
    }

}