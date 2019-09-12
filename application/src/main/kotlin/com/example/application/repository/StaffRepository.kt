package com.example.application.repository

import com.example.domain.entity.Staff

interface StaffRepository {
    fun save(staff: Staff)
    fun delete(staff: Staff)
    fun get(id: String): Staff?
    fun list(): List<Staff>
}
