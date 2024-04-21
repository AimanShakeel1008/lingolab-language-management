package com.lingolab.languagemanagement.controller;

import com.lingolab.languagemanagement.model.LanguageContent;
import com.lingolab.languagemanagement.service.LanguageContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contents")
public class LanguageContentController {
    @Autowired
    private LanguageContentService languageContentService;

    @GetMapping("/language/{languageId}")
    public ResponseEntity<List<LanguageContent>> getAllContentsForLanguage(@PathVariable Long languageId) {
        List<LanguageContent> contents = languageContentService.findAllByLanguageId(languageId);
        if (contents.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(contents);
    }

    // GET endpoint to retrieve a specific content by ID
    @GetMapping("/{id}")
    public ResponseEntity<LanguageContent> getContentById(@PathVariable Long id) {
        return languageContentService.getContentById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<LanguageContent> createContent(@RequestBody LanguageContent content) {
        return ResponseEntity.ok(languageContentService.addContentToLanguage(content));
    }
}
