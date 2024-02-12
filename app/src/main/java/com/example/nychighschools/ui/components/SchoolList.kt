package com.example.nychighschools.ui.components

import SchoolListItem
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.nychighschools.data.model.School

@Composable
fun SchoolList(
    schools: List<School>,
    onItemClick: @Composable (School) -> Unit
) {
    LazyColumn {
//        items(schools) { school ->
//            SchoolListItem(school = school, onItemClick = onItemClick)
//        }
    }
}
