package com.solution.reddy.domain.article.entity;

import com.solution.reddy.domain.article.dto.response.ArticleTitleResponseDto;
import com.solution.reddy.domain.article.dto.response.DetailArticleDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "tb_article")
@AllArgsConstructor
public class ArticleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "article_id")
    Long id;
    String title;
    String contents;

    Long goodCount;
    Long sadCount;
    Long angryCount;
    Long sosoCount;


    @Builder
    public ArticleEntity createArticleEntity(String title, String contents) {
        this.title = title;
        this.contents = contents;

        this.goodCount = 0L;
        this.sadCount = 0L;
        this.angryCount = 0L;
        this.sosoCount = 0L;
        return this;
    }

    public DetailArticleDto toDetailArticleDto() {
        return DetailArticleDto.builder()
                .title(this.title)
                .contents(this.contents)
                .goodCount(this.goodCount)
                .sadCount(this.sadCount)
                .angryCount(this.angryCount)
                .sosoCount(this.sosoCount)
                .build();
    }
}