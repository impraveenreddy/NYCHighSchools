package com.example.nychighschools.data.repository

import com.example.nychighschools.data.model.School

interface SchoolRepository {
    suspend fun getSchools(): List<School>
    suspend fun getSchoolDetails(dbn: String): School
}