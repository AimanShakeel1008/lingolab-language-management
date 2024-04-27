package com.lingolab.languagemanagement.service;

import com.lingolab.languagemanagement.model.Country;
import com.lingolab.languagemanagement.model.Language;
import com.lingolab.languagemanagement.repository.CountryRepository;
import com.lingolab.languagemanagement.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LanguageService {
    @Autowired
    private LanguageRepository languageRepository;

    @Autowired
    private CountryRepository countryRepository;

    public List<Language> getAllLanguages() {
        return languageRepository.findAll();
    }

    public Optional<Language> getLanguageById(Long id) {
        return languageRepository.findById(id);
    }

    public Language registerLanguage(Language language) {
        return languageRepository.save(language);
    }

    public List<Country> getAllCountries() { return countryRepository.findAll();
    }
}
