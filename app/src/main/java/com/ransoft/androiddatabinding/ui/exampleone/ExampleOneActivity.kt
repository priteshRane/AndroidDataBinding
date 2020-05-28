package com.ransoft.androiddatabinding.ui.exampleone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.ransoft.androiddatabinding.R
import com.ransoft.androiddatabinding.data.entities.User
import com.ransoft.androiddatabinding.databinding.ActivityExampleOneBinding

class ExampleOneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityExampleOneBinding = DataBindingUtil.setContentView(this, R.layout.activity_example_one)

        binding.user = User("Pritesh", "Rane")
    }
}
