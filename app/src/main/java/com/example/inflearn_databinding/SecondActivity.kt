package com.example.inflearn_databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.inflearn_databinding.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_second)
        setCurrentFragment(R.id.flSecond, TestFragment())
    }

    private fun setCurrentFragment(frameLayoutId: Int, fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(frameLayoutId, fragment)
            commit()
        }
}
