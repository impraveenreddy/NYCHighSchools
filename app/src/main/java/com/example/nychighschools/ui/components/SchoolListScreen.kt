package com.example.nychighschools.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.nychighschools.data.model.School

@Composable
fun SchoolListScreen(
    schools: List<School>,
    onSchoolSelected: (String) -> Unit
) {
    LazyColumn {
        items(schools.size) { index ->
            val school = schools[index]
            Text(
                text = "${school.schoolName} (${school.dbn})",
                modifier = Modifier
                    .padding(16.dp)
                    .clickable { onSchoolSelected(school.dbn) },
                style = MaterialTheme.typography.subtitle1
            )
            Divider()
        }
    }
}