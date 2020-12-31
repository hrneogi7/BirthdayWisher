package com.example.birthdaywisher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreetingCardActivity : AppCompatActivity() {
    companion object{
        const val Name_extra="name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting_card)

        val name=intent.getStringExtra(Name_extra)
        val textView=findViewById<TextView>(R.id.textView4).apply {
            text="$name"
        }



    }
}