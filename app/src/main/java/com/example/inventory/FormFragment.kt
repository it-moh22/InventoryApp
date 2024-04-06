package com.example.inventory

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.inventory.databinding.FragmentFormBinding

class FormFragment : Fragment() {

    private  lateinit var binding: FragmentFormBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFormBinding.inflate(inflater, container, false)

        binding.BackBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_formFragment_to_homeFragment)
        }
        return binding.root
    }
}