package com.example.pretest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class menu2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu2)
    }

    fun menu3(view: View) {
        val intent = Intent(this, menu3::class.java)
        startActivity(intent)
    }
}
