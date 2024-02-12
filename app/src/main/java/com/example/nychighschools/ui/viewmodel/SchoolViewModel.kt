package com.example.nychighschools.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nychighschools.data.model.School
import com.example.nychighschools.data.repository.SchoolRepository
import kotlinx.coroutines.launch

class SchoolViewModel(private val repository: SchoolRepository) : ViewModel() {

    private val _schools = MutableLiveData<List<School>>()
    val schools: LiveData<List<School>> get() = _schools

    private val _selectedSchool = MutableLiveData<School>()
    val selectedSchool: LiveData<School> get() = _selectedSchool

    fun fetchSchools() {
        viewModelScope.launch {
            try {
                _schools.value = repository.getSchools()
            } catch (e: Exception) {
                // Handle error
            }
        }
    }

    fun selectSchool(dbn: String) {
        viewModelScope.launch {
            try {
                _selectedSchool.value = repository.getSchoolDetails(dbn)
            } catch (e: Exception) {
                // Handle error
            }
        }
    }
}



