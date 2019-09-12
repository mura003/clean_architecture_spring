package com.example.adapter.gateway

import com.example.application.repository.StaffRepository
import com.example.domain.entity.Staff
import org.springframework.stereotype.Repository

@Repository
class StaffInMemoryGateway : StaffRepository {

    // 本来はdriverに持っていくべきでしょうね。
    val repository = mutableMapOf<String, Staff>()

    override fun save(staff: Staff) {
        repository[staff.id] = staff
    }

    override fun delete(staff: Staff) {
        repository.remove(staff.id)
    }

    override fun get(id: String): Staff? {
        return repository[id]
    }

    override fun list(): List<Staff> {
        return repository.map { it.value }
    }
}