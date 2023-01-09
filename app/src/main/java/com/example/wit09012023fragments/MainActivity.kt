package com.example.wit09012023fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        before navigation
//        supportFragmentManager.beginTransaction()
//            .add(R.id.fragment, BlankFragment())
//            .addToBackStack(null)
//            .commit()
    }
}