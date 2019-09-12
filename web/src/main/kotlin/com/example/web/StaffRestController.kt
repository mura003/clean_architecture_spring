package com.example.web

import com.example.adapter.controller.StaffController
import com.example.model.StaffForm
import com.example.model.StaffViewModel
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/staffs", consumes = [MediaType.APPLICATION_JSON_VALUE])
class StaffRestController(
        val staffController: StaffController
) {

    @GetMapping
    fun list(): List<StaffViewModel> {
        return staffController.list().map { StaffViewModel(it.id, it.name, it.createdAt, it.updatedAt) }
    }

    @GetMapping("{id}")
    fun get(@PathVariable id: String): StaffViewModel? {
        val output = staffController.get(id)

        if (output == null) {
            return null
        }

        return StaffViewModel(output.id, output.name, output.createdAt, output.updatedAt)
    }

    @PostMapping
    fun create(
            @RequestBody form: StaffForm
    ): StaffViewModel {
        val output = staffController.create(form.name!!)
        return StaffViewModel(output.id, output.name, output.createdAt, output.updatedAt)
    }

    @PutMapping("{id}")
    fun update(
            @PathVariable id: String,
            @RequestBody form: StaffForm
    ): StaffViewModel {
        val output = staffController.update(id, form.name!!)
        return StaffViewModel(output.id, output.name, output.createdAt, output.updatedAt)
    }

    @DeleteMapping("{id}")
    fun delete(
            @PathVariable id: String
    ) {
        staffController.delete(id)
    }
}