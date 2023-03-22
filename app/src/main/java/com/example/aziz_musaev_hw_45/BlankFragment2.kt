package com.example.aziz_musaev_hw_45

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResultListener
import com.example.aziz_musaev_hw_45.databinding.FragmentBlank2Binding


class BlankFragment2 : Fragment() {

    lateinit var binding: FragmentBlank2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentBlank2Binding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setFragmentResultListener("key"){
                key,bundle->
            val first = bundle.getString("first")
            val second = bundle.getString("second")
            val percentage = bundle.getString("percentage")
            val result = bundle.getString("result")
            binding.firstTv.setText(first)
            binding.secondTv.setText(second)
            binding.percentageTv.setText(percentage)
            binding.resultTv.setText(result)

        }
    }
}