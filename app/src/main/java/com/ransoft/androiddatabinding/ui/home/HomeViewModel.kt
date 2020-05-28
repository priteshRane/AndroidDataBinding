package com.ransoft.androiddatabinding.ui.home

import android.view.View
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    var homeListener: HomeListener? = null
    fun onExampleOneClick(view: View)  {
        homeListener?.goToExampleOne()
    }
}