package com.example.birthdaygreet

//import BirthdayGreeting
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_birthday_greeting.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import android.content.Intent as Intent1
import android.widget.Toast.makeText as makeText1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val btn_click_me = findViewById(R.id.CreateBirthdayActivity) as Button
//// set on-click listener
//        btn_click_me.setOnClickListener {
//            Toast.makeText(this@MainActivity,
//                "Happy Birthday.", Toast.LENGTH_SHORT).show()
//        }


    }

    @SuppressLint("SuspiciousIndentation")
    fun CreateCard(view: View) {
        //for displaying the context for onclick
        val name = Username.editableText.toString() //for displaying name in toast
        val intent= Intent1(this,BirthdayGreetingActivity::class.java)
//        intent.putExtra(BirthdayGreeting.NameExtra, name)
     intent.putExtra(BirthdayGreetingActivity.NameExtra,name)
        startActivity(intent);

// Toast.makeText(this, "name is $name", Toast.LENGTH_LONG).show()

    }
}

