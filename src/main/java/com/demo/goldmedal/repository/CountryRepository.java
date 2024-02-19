package com.demo.goldmedal.repository;

import com.demo.goldmedal.model.Country;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CountryRepository extends CrudRepository<Country, Integer> {

    Optional<Country> findByName(String countryName);

    List<Country> findAll();

    List<Country> findAllByOrderByNameAsc();

    List<Country> findAllByOrderByNameDesc();

    List<Country> findAllByOrderByGdpAsc();

    List<Country> findAllByOrderByGdpDesc();

    List<Country> findAllByOrderByPopulationAsc();

    List<Country> findAllByOrderByPopulationDesc();

}
