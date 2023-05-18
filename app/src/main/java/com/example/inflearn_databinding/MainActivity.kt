package com.example.inflearn_databinding

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.inflearn_databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var person : Person
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val array = ArrayList<String>()
        array.add("a")
        array.add("b")
        array.add("c")
        array.add("d")

        val customAdapter = CustomAdapter(array)
        val rv = binding.rvMain
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = customAdapter
    }

}