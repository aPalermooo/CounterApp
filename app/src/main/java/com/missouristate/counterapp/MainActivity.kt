package com.missouristate.counterapp

import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.DisplayCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.missouristate.counterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    //ref developer.android.com/topic/libraries/view-binding#setup
    private lateinit var binding : ActivityMainBinding

    class Counter {
        private var count: Int = 0
        fun addCount() {
            count++
        }

        fun getCount(): Int {
            return count
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //ref ChatGPT for syntax debugging
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val display = binding.counterDisplay
        val button = binding.counterButton
        val count = Counter()

        button.setOnClickListener{
            count.addCount()
            display.text = count.getCount().toString()

            //ref developer.android.com/studio/debug
//            Log.d("ButtonPress", "Button!!!")
        }



    }
}