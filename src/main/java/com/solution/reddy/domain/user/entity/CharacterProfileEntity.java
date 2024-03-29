package com.solution.reddy.domain.user.entity;

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

@Builder @Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity @Table(name = "tb_character_profile")
public class CharacterProfileEntity {
    @Id @Column(name = "character_profile_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String characterName;
    String imageUrl;
    String description;
}
