package com.example.model

import java.time.LocalDate
import java.time.LocalDateTime

data class StaffViewModel(
        val id: String,
        val name: String,
        val createdAt: LocalDateTime,
        val updatedAt: LocalDateTime
)