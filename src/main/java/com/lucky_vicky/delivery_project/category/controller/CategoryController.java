package com.lucky_vicky.delivery_project.category.controller;

import com.lucky_vicky.delivery_project.category.dto.CreateCategoryRequestDto;
import com.lucky_vicky.delivery_project.category.usecase.CreateCategoryUseCase;
import com.lucky_vicky.delivery_project.category.usecase.DeleteCategoryUseCase;
import com.lucky_vicky.delivery_project.category.usecase.ReadAllCategoriesUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1/categories")
public class CategoryController {
    private final CreateCategoryUseCase createCategoryUseCase;
    private final ReadAllCategoriesUseCase readAllCategoriesUseCase;
    private final DeleteCategoryUseCase deleteCategoryUseCase;

    /**
     * 카테고리 생성
     * */
    @PostMapping("")
    public ResponseEntity<?> createCategory(
            @RequestBody CreateCategoryRequestDto createCategoryRequestDto
    ) {
        return ResponseEntity.ok(createCategoryUseCase.createCategory(createCategoryRequestDto));
    }

    /**
     * 가게 카테고리 전체 조회
     * */
    @GetMapping("/store")
    public ResponseEntity<?> readAllStoreCategories() {
        return ResponseEntity.ok(readAllCategoriesUseCase.readAllStoreCategories());
    }

    /**
     * 지역 카테고리 전체 조회
     * */
    @GetMapping("/local")
    public ResponseEntity<?> readAllLocalCategories() {
        return ResponseEntity.ok(readAllCategoriesUseCase.readAllLocalCategories());
    }

    /**
     * 가게 카테고리 삭제
     * */
    @DeleteMapping("/store/{categoryId}")
    public ResponseEntity<?> deleteStoreCategory(
            @PathVariable UUID categoryId
    ) {
        deleteCategoryUseCase.deleteStoreCategory(categoryId);
        return ResponseEntity.noContent().build();
    }

    /**
     * 지역 카테고리 삭제
     * */
    @DeleteMapping("/local/{categoryId}")
    public ResponseEntity<?> deleteLocalCategory(
            @PathVariable UUID categoryId
    ) {
        deleteCategoryUseCase.deleteLocalCategory(categoryId);
        return ResponseEntity.noContent().build();
    }

}
