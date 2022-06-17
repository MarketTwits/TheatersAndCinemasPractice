package com.example.theatersandcinemaspractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.theatersandcinemaspractice.databinding.FragmentCInemaBinding
import com.example.theatersandcinemaspractice.databinding.FragmentCinemasInTheatersBinding
import com.example.theatersandcinemaspractice.databinding.FragmentTheatersBinding


class CinemasInTheatersFragment : Fragment() {

    private lateinit var binding: FragmentCinemasInTheatersBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCinemasInTheatersBinding.inflate(inflater, container, false)
        return binding.root
    }

}