package com.example.adapter.controller

import com.example.application.model.*
import com.example.application.usecase.*
import org.springframework.stereotype.Component

@Component
class StaffController(
        private val staffCreateUsecase: StaffCreateUsecase,
        private val staffUpdateUsecase: StaffUpdateUsecase,
        private val staffDeleteUsecase: StaffDeleteUsecase,
        private val staffGetUsecase: StaffGetUsecase,
        private val staffListUsecase: StaffListUsecase
) {

    fun create(name: String): StaffOutputData {
        val inputData = StaffCreateInputData(name)
        return staffCreateUsecase.handle(inputData)
    }

    fun update(id: String, name: String): StaffOutputData {
        val inputData = StaffUpdateInputData(id, name)
        return staffUpdateUsecase.handle(inputData)
    }

    fun delete(id: String) {
        val inputData = StaffDeleteInputData(id)
        return staffDeleteUsecase.handle(inputData)
    }

    fun get(id: String): StaffOutputData? {
        val inputData = StaffGetInputData(id)
        return staffGetUsecase.handle(inputData)
    }

    fun list() : List<StaffOutputData> {
        return staffListUsecase.handle()
    }
}