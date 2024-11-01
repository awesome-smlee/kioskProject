package com.insilicogen.kioskproject.layer.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MenuCategory {
    private final String MenuCategoryId;
    private final String MenuCategoryName;
}
