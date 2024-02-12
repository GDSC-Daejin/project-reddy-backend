package com.solution.reddy.domain.article.controller.repository;

import com.solution.reddy.domain.article.entity.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<ArticleEntity, Long> {

}