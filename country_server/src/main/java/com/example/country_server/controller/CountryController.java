package com.example.country_server.controller;

import com.example.country_server.entity.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CountryController {
    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        List<Country> countries = new ArrayList<Country>();
        countries.add(new Country("Turkiye", "Ankara", "TL"));
        countries.add(new Country("Sweden", "Stockholm", "SEK"));
        return countries;
    }
}
