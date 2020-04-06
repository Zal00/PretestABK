package com.example.pretest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.provider.AlarmClock.EXTRA_MESSAGE
import kotlinx.android.synthetic.main.activity_menu3.*

class menu3 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu3)
    }

    fun menu4(view: View) {
        val name = editText2.text.toString()
        val intent = Intent(this, menu4::class.java)
         intent.putExtra(EXTRA_MESSAGE, name)
        startActivity(intent)
    }
}
