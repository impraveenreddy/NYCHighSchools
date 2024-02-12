package com.example.nychighschools.ui.screens

import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.nychighschools.data.network.SchoolApiService
import com.example.nychighschools.data.repository.SchoolRepositoryImpl
import com.example.nychighschools.ui.components.SchoolDetailsScreen
import com.example.nychighschools.ui.components.SchoolListScreen
import com.example.nychighschools.ui.viewmodel.SchoolViewModel
import com.example.nychighschools.ui.viewmodel.SchoolViewModelFactory


class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: SchoolViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Create SchoolApiService instance
        val apiService = SchoolApiService.create()

        // Create SchoolRepositoryImpl instance
        val repository = SchoolRepositoryImpl(apiService)

        // Instantiate ViewModel using ViewModelProvider
        val viewModelFactory = SchoolViewModelFactory(repository)

        viewModel = ViewModelProvider(this, viewModelFactory).get(SchoolViewModel::class.java)
        Log.d("SchoolsData", ""+viewModel.schools.toString())

        // Set content using setContent
        setContent {
            val selectedSchool = viewModel.selectedSchool.value

            if (selectedSchool == null) {
                // Display list of schools
                val schools = viewModel.schools.value
                schools?.let {
                    SchoolListScreen(it) { dbn ->
                        viewModel.selectSchool(dbn)
                    }
                }
            } else {
                // Display school details
                SchoolDetailsScreen(selectedSchool)
            }
        }

        // Fetch schools
        viewModel.fetchSchools()
    }
}


