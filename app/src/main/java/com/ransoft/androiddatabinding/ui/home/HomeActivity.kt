package com.ransoft.androiddatabinding.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import com.ransoft.androiddatabinding.R
import com.ransoft.androiddatabinding.databinding.ActivityHomeBinding
import com.ransoft.androiddatabinding.ui.exampleone.ExampleOneActivity
import com.ransoft.androiddatabinding.util.toast

class HomeActivity : AppCompatActivity(), HomeListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityHomeBinding = DataBindingUtil.setContentView(this, R.layout.activity_home)
        val viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        binding.homeviewmodel = viewModel

        viewModel.homeListener = this
    }

    override fun goToExampleOne() {
        toast("Redirecting to Example one")
        val intent = Intent(this, ExampleOneActivity::class.java)
        startActivity(intent)
    }
}
