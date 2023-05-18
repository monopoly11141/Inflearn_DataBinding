package com.example.inflearn_databinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.inflearn_databinding.databinding.FragmentTestBinding


class TestFragment : Fragment() {

    private lateinit var binding : FragmentTestBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_test, container, false)

        binding.tvTest.text = "바뀐 텍스트"
        // Inflate the layout for this fragment
        return binding.root
    }

}