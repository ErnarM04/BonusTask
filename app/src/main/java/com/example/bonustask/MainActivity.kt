package com.example.bonustask

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import com.example.bonustask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    internal lateinit var binding: ActivityMainBinding
    protected lateinit var fn: String
    protected lateinit var ln: String
    protected lateinit var bd: String
    protected lateinit var lg: String
    protected lateinit var pw: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstname: EditText = findViewById(R.id.firstname)
        val lastname: EditText = findViewById(R.id.lastname)
        val birthday: EditText = findViewById(R.id.birthday)
        val login: EditText = findViewById(R.id.login)
        val password: EditText = findViewById(R.id.password)

        val button = findViewById<Button>(R.id.signupbutton)
        button.setOnClickListener{
            fn = firstname.getText().toString()
            ln = lastname.getText().toString()
            bd = birthday.getText().toString()
            lg = login.getText().toString()
            pw = password.getText().toString()
            var intent = Intent(this, Person::class.java)
            intent.putExtra("firstname", fn)
            intent.putExtra("lastname", ln)
            intent.putExtra("birthday", bd)
            intent.putExtra("login", lg)
            intent.putExtra("password", pw)
            intent = Intent(this, UserDetailsActivity::class.java)
            intent.putExtra("firstname", fn)
            intent.putExtra("lastname", ln)
            intent.putExtra("birthday", bd)
            intent.putExtra("login", lg)
            intent.putExtra("password", pw)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }


}