package com.example.nychighschools.data.repository

import com.example.nychighschools.data.model.School
import com.example.nychighschools.data.network.SchoolApiService

class SchoolRepositoryImpl(private val apiService: SchoolApiService) : SchoolRepository {

    override suspend fun getSchools(): List<School> {
        return apiService.getSchools()
    }

    override suspend fun getSchoolDetails(dbn: String): School {
        return apiService.getSchoolDetails(dbn)
    }
}
