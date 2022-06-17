package com.example.theatersandcinemaspractice

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.StrictMode
import android.os.StrictMode.ThreadPolicy
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.theatersandcinemaspractice.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Thread {
            Test.connection()
        }.start()


    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.idTheaters -> openTheatersFragment()
            R.id.idCinemas -> openCinemFragment()
            R.id.idCinemasInTheaters -> openCinemaAndTheatersFragment()
        }
        return super.onOptionsItemSelected(item)
    }
    fun openTheatersFragment(){
        binding.frameLayount.isVisible = true
        supportFragmentManager.beginTransaction().add(R.id.frameLayount, TheatersFragment()).commit()
    }
    fun openCinemFragment(){
        binding.frameLayount.isVisible = true
        supportFragmentManager.beginTransaction().add(R.id.frameLayount, CInemaFragment()).commit()
    }
    fun openCinemaAndTheatersFragment(){
        binding.frameLayount.isVisible = true
        supportFragmentManager.beginTransaction().add(R.id.frameLayount, CinemasInTheatersFragment()).commit()
    }








    }