package com.lucky_vicky.delivery_project.global.exception;

import lombok.Getter;

@Getter
public enum ExceptionCode {
    EXIST_PRODUCT(403, "존재하는 상품입니다."),
    PRODUCT_NOT_FOUNT(404, "상품을 찾을 수 없습니다."),
    PRODUCT_IS_HIDDEN(403, "숨김 처리된 상품입니다."),
    ORDER_NOT_FOUNT(404, "주문을 찾을 수 없습니다."),
    STORE_NOT_FOUND(404,"가게를 찾을 수 없습니다."),
    USER_NOT_FOUND(404,"사용자를 찾을 수 없습니다."),
    ORDER_CANCEL_TIME_EXCEEDED(422,"주문 취소는 주문 후 5분 이내에만 가능합니다."),
    DELIVERY_ALREADY_DELETED(404, "이미 삭제된 배송지입니다."),
    DELIVERY_NOT_FOUND(404, "배송지를 찾을 수 없습니다."),
    DELIVERY_EXISTS(400, "이미 등록된 배송지 입니다."),
    CATEGORY_NOT_FOUND(404,"카테고리를 찾을 수 없습니다."),
    REVIEW_NOT_FOUND(404, "후기를 찾을 수 없습니다."),
    NOTICE_NOT_FOUND(404, "공지사항을 찾을 수 없습니다."),
    EMPTY_AUTHENTICATION(401, "인증 정보가 없습니다."),
    ACCESS_DENIED_ERROR(403, "접근 권한이 없습니다."),
    INVALID_CATEGORY_TYPE(400, "유효하지 않은 카테고리 타입입니다."),
    DEFAULT_DELIVERY_NOT_FOUND(404, "기본 배송지가 설정되어 있지 않습니다."),
    REPORT_NOT_FOUND(404, "신고를 찾을 수 없습니다.");


    private int status;
    private String message;

    ExceptionCode(int code, String message) {
        this.status = code;
        this.message = message;
    }
}
