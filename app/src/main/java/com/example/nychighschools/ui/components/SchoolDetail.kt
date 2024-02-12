package com.example.nychighschools.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.nychighschools.data.model.School

@Composable
fun SchoolDetail(school: School) {
    Column {
        Text(text = "School Name: ${school.schoolName}")
        Text(text = "DBN: ${school.dbn}")
        Text(text = "Overview:")
        Text(text = school.overviewParagraph)
    }
}
