package com.example.navigationtabs

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory(
    private var app: App
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val viewModel = when (modelClass) {
            FirstViewModel::class.java -> FirstViewModel(app.repositoryImpl)
            SecondViewModel::class.java -> SecondViewModel(app.repositoryImpl)
            else -> throw IllegalStateException("unknown viewModel")
        }
        return viewModel as T
    }
}

fun Fragment.factory() = ViewModelFactory(requireContext().applicationContext as App)