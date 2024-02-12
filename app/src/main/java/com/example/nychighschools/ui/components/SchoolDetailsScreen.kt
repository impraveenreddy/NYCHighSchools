package com.example.nychighschools.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.nychighschools.data.model.School

@Composable
fun SchoolDetailsScreen(school: School) {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text(text = school.schoolName, style = MaterialTheme.typography.h5)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = school.overviewParagraph, style = MaterialTheme.typography.body1)
    }
}