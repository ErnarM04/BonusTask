package com.example.bonustask

import android.widget.EditText
import android.content.Intent
import com.example.bonustask.MainActivity

class Person {
    private lateinit var intent: Intent
    val firstname = intent.getStringExtra("firstname")
    val lastname = intent.getStringExtra("lastname")
    val birthday = intent.getStringExtra("birthday")
    val login = intent.getStringExtra("login")
    val password = intent.getStringExtra("password")
}