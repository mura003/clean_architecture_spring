package com.example.domain.entity

import java.time.LocalDateTime

data class Staff(
        val id: String,
        val name: String,
        val createdAt: LocalDateTime,
        val updatedAt: LocalDateTime
) {}