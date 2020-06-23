package com.example.finalproject

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var content:FrameLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCatch: Button = findViewById(R.id.SignUp)
        btnCatch.setOnClickListener {
            val user = InputUser.text.toString()
            val password = InputPass.text.toString()

            if (user.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please INsert Username And Password", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }

            if (user == "admin" && password == "admin101") {
                val intent = Intent(this@MainActivity, Dashboard::class.java)
                startActivity(intent)
            }
            else {
                Toast.makeText(this, "Wrong username and password",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
        }
    }

}
