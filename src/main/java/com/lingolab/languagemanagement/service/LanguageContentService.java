package com.lingolab.languagemanagement.service;

import com.lingolab.languagemanagement.model.LanguageContent;
import com.lingolab.languagemanagement.repository.LanguageContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LanguageContentService {
    @Autowired
    private LanguageContentRepository languageContentRepository;

    public List<LanguageContent> findAllByLanguageId(Long languageId) {
        return languageContentRepository.findByLanguageId(languageId);
    }

    public Optional<LanguageContent> getContentById(Long id) {
        return languageContentRepository.findById(id);
    }

    public LanguageContent addContentToLanguage(LanguageContent content) {
        return languageContentRepository.save(content);
    }
}