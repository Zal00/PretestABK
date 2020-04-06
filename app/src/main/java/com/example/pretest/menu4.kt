package com.example.pretest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.content.Intent
import android.view.View
import kotlinx.android.synthetic.main.activity_menu3.*
import kotlinx.android.synthetic.main.activity_menu4.*

class menu4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu4)


        val name = intent.getStringExtra(EXTRA_MESSAGE)
            textView8.setText(
                "Beres! Sekarang "+name+" udah bisa ngecek penggunaan HP mu tiap hari buat bantu kamu ngatur waktu :)"
            )
    }

    fun exit(view: View) {
        moveTaskToBack(true)
        finish()
        System.exit(0)
    }
}
