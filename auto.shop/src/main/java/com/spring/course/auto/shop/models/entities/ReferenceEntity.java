package com.spring.course.auto.shop.models.entities;

import lombok.*;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class ReferenceEntity {
    @NotNull
    private Long id;

    private String name;
}
