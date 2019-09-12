package com.example.application.usecase

import com.example.application.model.*

interface StaffCreateUsecase {
    fun handle(inputData: StaffCreateInputData): StaffOutputData
}

interface StaffUpdateUsecase {
    fun handle(inputData: StaffUpdateInputData): StaffOutputData
}

interface StaffDeleteUsecase {
    fun handle(inputData: StaffDeleteInputData)
}

interface StaffGetUsecase {
    fun handle(inputData: StaffGetInputData): StaffOutputData?
}

interface StaffListUsecase {
    fun handle(): List<StaffOutputData>
}