package com.example.adapter.presenter

import com.example.application.model.StaffOutputData

interface StaffPresenter {
    fun complete(staffOutputData: StaffOutputData)
}