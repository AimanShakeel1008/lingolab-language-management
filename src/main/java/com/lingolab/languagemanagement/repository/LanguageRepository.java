package com.lingolab.languagemanagement.repository;

import com.lingolab.languagemanagement.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language, Long> {
}
