/**
 * Tanggal 3 = Pengerjaan Halaman Pertama
 * Tanggal 4 = Pengerjaan Halaman Pertama
 * Tanggal 4 = Pengerjaan Halaman Kedua
 * Tanggal 5 = Pengerjaan Halaman Ketiga
 * Tanggal 6 = Pengerjaan Halaman Keempat
 * Tanggal 7 = Pengerjaan Halaman Keempat
**/
package com.example.pretest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun menu2(view: View) {
        val intent = Intent(this, menu2::class.java)
        startActivity(intent)
    }
}
