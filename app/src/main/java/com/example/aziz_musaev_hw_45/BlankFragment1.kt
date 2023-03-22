package com.example.aziz_musaev_hw_45

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.aziz_musaev_hw_45.databinding.FragmentBlank1Binding
import com.example.aziz_musaev_hw_45.remote.LoveModel
import com.example.aziz_musaev_hw_45.remote.LoveService
import com.example.aziz_musaev_hw_45.viewmodel.LoveViewModel
import retrofit2.Call
import retrofit2.Response

class BlankFragment1 : Fragment() {
    lateinit var binding: FragmentBlank1Binding
    private val viewModel: LoveViewModel by viewModels()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentBlank1Binding.inflate(layoutInflater)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initClicker()
        super.onViewCreated(view, savedInstanceState)
    }
    @SuppressLint("FragmentLiveDataObserve")
    private fun initClicker() {

        with(binding){
            calculateBtn.setOnClickListener{
                viewModel.getLiveLove(firstEd.text.toString(),secondEd.text.toString()).observe(this@BlankFragment1,
                    Observer {
                        setFragmentResult("key", bundleOf(
                            "first" to it.firstName,
                            "second" to it.secondName,
                            "percentage" to it.percentage,
                            "result" to it.result))
                        findNavController().navigate(R.id.blankFragment2)
                    })

                }
            }
        }

    }


