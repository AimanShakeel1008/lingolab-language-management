package com.lingolab.languagemanagement.controller;

import com.lingolab.languagemanagement.model.Country;
import com.lingolab.languagemanagement.model.Language;
import com.lingolab.languagemanagement.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {
    @Autowired
    private LanguageService languageService;

    // GET endpoint to retrieve all languages
    @GetMapping
    public ResponseEntity<List<Language>> getAllLanguages() {
        List<Language> languages = languageService.getAllLanguages();
        return ResponseEntity.ok(languages);
    }

    @GetMapping("/countries")
    public ResponseEntity<List<Country>> getAllCountries() {
        List<Country> countries = languageService.getAllCountries();
        return ResponseEntity.ok(countries);
    }

    // GET endpoint to retrieve a language by ID
    @GetMapping("/{id}")
    public ResponseEntity<Language> getLanguageById(@PathVariable Long id) {
        return languageService.getLanguageById(id)
                .map(language -> ResponseEntity.ok(language))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Language> createLanguage(@RequestBody Language language) {
        return ResponseEntity.ok(languageService.registerLanguage(language));
    }
}
