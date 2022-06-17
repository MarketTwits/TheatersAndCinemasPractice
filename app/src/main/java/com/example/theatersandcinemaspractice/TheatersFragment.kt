package com.example.theatersandcinemaspractice

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.theatersandcinemaspractice.databinding.FragmentTheatersBinding
import com.google.android.material.tabs.TabLayout
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.SQLException


class TheatersFragment : Fragment() {



    private lateinit var binding: FragmentTheatersBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTheatersBinding.inflate(inflater, container, false)
        return binding.root


    }

}