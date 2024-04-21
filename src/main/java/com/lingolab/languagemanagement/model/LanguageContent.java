package com.lingolab.languagemanagement.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "language_contents")
@Data
public class LanguageContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String url;  // URL to access the content

    @Enumerated(EnumType.STRING)
    private ContentType contentType;

    @ManyToOne
    @JoinColumn(name = "language_id", nullable = false)
    private Language language;
}
