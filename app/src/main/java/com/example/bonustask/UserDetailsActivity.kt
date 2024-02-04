package com.example.bonustask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class UserDetailsActivity : AppCompatActivity() {
    protected lateinit var fn: String
    protected lateinit var ln: String
    protected lateinit var pw: String
    protected lateinit var bd: String
    protected lateinit var lg: String
    private lateinit var intent: Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_details)
        fn = intent.getStringExtra("firstname").toString()
        ln = intent.getStringExtra("lastname").toString()
        bd = intent.getStringExtra("birthday").toString()
        lg = intent.getStringExtra("login").toString()
        pw = intent.getStringExtra("password").toString()
        var text1: TextView = findViewById(R.id.fn)
        text1.setText(fn)
        var text2: TextView = findViewById(R.id.ln)
        text2.setText(ln)
        var text3: TextView = findViewById(R.id.bd)
        text3.setText(bd)
        var text4: TextView = findViewById(R.id.lg)
        text4.setText(lg)
        var text5: TextView = findViewById(R.id.pw)
        text5.setText(pw)
    }
}