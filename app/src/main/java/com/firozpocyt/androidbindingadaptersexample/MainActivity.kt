package com.firozpocyt.androidbindingadaptersexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.firozpocyt.androidbindingadaptersexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val post = Post(
            "Introduction to kotlin",
            "Firoz Shaikh POC",
            "https://whizpool.com/wp-content/uploads/2022/10/kotlin1.jpg")
        binding.post = post
    }
}