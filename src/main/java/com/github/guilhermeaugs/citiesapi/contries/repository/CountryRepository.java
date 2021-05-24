package com.github.guilhermeaugs.citiesapi.contries.repository;

import com.github.guilhermeaugs.citiesapi.contries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
