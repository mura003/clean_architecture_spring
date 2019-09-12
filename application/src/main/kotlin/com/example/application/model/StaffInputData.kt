package com.example.application.model

data class StaffGetInputData(
        val id: String
)

data class StaffCreateInputData(
        val name: String
)

data class StaffUpdateInputData(
        val id: String,
        val name: String
)

data class StaffDeleteInputData(
        val id: String
)
