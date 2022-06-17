package com.example.theatersandcinemaspractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.theatersandcinemaspractice.databinding.FragmentCInemaBinding
import com.example.theatersandcinemaspractice.databinding.FragmentTheatersBinding

class CInemaFragment : Fragment() {

    private lateinit var binding: FragmentCInemaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCInemaBinding.inflate(inflater, container, false)
        return binding.root
    }


}