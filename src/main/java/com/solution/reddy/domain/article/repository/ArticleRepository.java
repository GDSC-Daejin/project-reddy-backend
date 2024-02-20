package com.solution.reddy.domain.article.repository;

import com.solution.reddy.domain.article.entity.ArticleEmotionEntity;
import com.solution.reddy.domain.article.entity.ArticleEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ArticleRepository extends JpaRepository<ArticleEntity, Long> {


}
