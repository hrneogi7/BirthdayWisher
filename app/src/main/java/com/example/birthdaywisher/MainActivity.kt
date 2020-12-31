package com.example.birthdaywisher

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText


import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun birthdayGreet(view: View) {
        val editText=findViewById<EditText>(R.id.inputname)
        val name=editText.text.toString()

        val intent=Intent(this,BirthdayGreetingCardActivity::class.java)
        intent.putExtra(BirthdayGreetingCardActivity.Name_extra,name)
        startActivity(intent)
    }
}





