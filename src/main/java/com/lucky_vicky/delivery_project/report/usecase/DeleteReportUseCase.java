package com.lucky_vicky.delivery_project.report.usecase;

import com.lucky_vicky.delivery_project.global.annotation.UseCase;

import java.util.UUID;

@UseCase("deleteReportUseCase")
public interface DeleteReportUseCase {
    void deleteReportByAdmin(UUID reportId);
    void deleteReportByUser(UUID userId, UUID reportId);
}
