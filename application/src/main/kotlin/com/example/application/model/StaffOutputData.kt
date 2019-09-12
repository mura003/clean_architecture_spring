package com.example.application.model

import java.time.LocalDateTime

data class StaffOutputData(
        val id: String,
        val name: String,
        val createdAt: LocalDateTime,
        val updatedAt: LocalDateTime
)