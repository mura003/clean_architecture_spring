package com.example.application.usecase.interactor

import com.example.application.model.*
import com.example.application.repository.StaffRepository
import com.example.application.usecase.*
import com.example.domain.entity.Staff
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.util.*

@Service
class StaffCreateInteractor(
        val staffRepository: StaffRepository
) : StaffCreateUsecase {
    override fun handle(inputData: StaffCreateInputData): StaffOutputData {
        val staff = Staff(
                UUID.randomUUID().toString(),
                inputData.name,
                LocalDateTime.now(),
                LocalDateTime.now()
        )
        staffRepository.save(staff)

        return StaffOutputData(
                staff.id, staff.name, staff.createdAt, staff.updatedAt
        )
    }
}

@Service
class StaffUpdateInteractor(
        val staffRepository: StaffRepository
) : StaffUpdateUsecase {
    override fun handle(inputData: StaffUpdateInputData): StaffOutputData {

        var staff = staffRepository.get(inputData.id)

        if (staff == null) {
            staff = Staff(
                    UUID.randomUUID().toString(),
                    inputData.name,
                    LocalDateTime.now(),
                    LocalDateTime.now()
            )
        } else {
            staff = Staff(staff.id, inputData.name, staff.createdAt, LocalDateTime.now())
        }

        staffRepository.save(
                staff
        )

        return StaffOutputData(
                staff.id, staff.name, staff.createdAt, staff.updatedAt
        )
    }
}

@Service
class StaffDeleteInteractor(
        val staffRepository: StaffRepository
) : StaffDeleteUsecase {
    override fun handle(inputData: StaffDeleteInputData) {
        val staff = staffRepository.get(inputData.id)

        if (staff != null) {
            staffRepository.delete(staff)
        }
    }

}

@Service
class StaffListInteractor(
        val staffRepository: StaffRepository
) : StaffListUsecase {
    override fun handle(): List<StaffOutputData> {
        return staffRepository.list().map { StaffOutputData(it.id, it.name, it.createdAt, it.updatedAt) }
    }
}

@Service
class StaffGetInteractor(
        val staffRepository: StaffRepository
) : StaffGetUsecase {
    override fun handle(inputData: StaffGetInputData): StaffOutputData? {
        val output = staffRepository.get(inputData.id)

        if (output == null) {
            return null
        }
        return StaffOutputData(output.id, output.name, output.createdAt, output.updatedAt)
    }
}
