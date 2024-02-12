package com.example.nychighschools.ui.screens

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.nychighschools.ui.components.SchoolDetail
import com.example.nychighschools.ui.components.SchoolList
import com.example.nychighschools.ui.viewmodel.SchoolViewModel

@Composable
fun NYCHighSchoolsApp(viewModel: SchoolViewModel) {
    val schools = viewModel.schools.value ?: emptyList()

    SchoolList(schools = schools) { selectedSchool ->
        // You can handle the click event here
        SchoolDetail(selectedSchool)
    }
}
