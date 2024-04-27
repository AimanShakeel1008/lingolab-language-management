package com.lingolab.languagemanagement.repository;

import com.lingolab.languagemanagement.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
