package com.lingolab.languagemanagement.repository;

import com.lingolab.languagemanagement.model.LanguageContent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LanguageContentRepository extends JpaRepository<LanguageContent, Long> {
    List<LanguageContent> findByLanguageId(Long languageId);
}
