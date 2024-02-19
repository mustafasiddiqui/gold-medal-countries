package com.demo.goldmedal.repository;

import com.demo.goldmedal.model.GoldMedal;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GoldMedalRepository extends CrudRepository<GoldMedal, Integer> {


    List<GoldMedal> findBySeason(String season);

    List<GoldMedal> findBySeasonAndCountry(String season, String countryName);

    List<GoldMedal> findByCountry(String countryName);

    List<GoldMedal> findByCountryOrderByYearAsc(String countryName);

    List<GoldMedal> findByCountryOrderByYearDesc(String countryName);

    List<GoldMedal> findByCountryOrderBySeasonAsc(String countryName);

    List<GoldMedal> findByCountryOrderBySeasonDesc(String countryName);

    List<GoldMedal> findByCountryOrderByCityAsc(String countryName);

    List<GoldMedal> findByCountryOrderByCityDesc(String countryName);

    List<GoldMedal> findByCountryOrderByNameAsc(String countryName);

    List<GoldMedal> findByCountryOrderByNameDesc(String countryName);

    List<GoldMedal> findByCountryOrderByEventAsc(String countryName);

    List<GoldMedal> findByCountryOrderByEventDesc(String countryName);

    int countByCountry(String countryName);

    int countByCountryAndGender(String countryName, String gender);


}
