package com.study.thridclass

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btnGreetApp = findViewById<Button>(R.id.btnGreetApp)
        val btnIMCApp = findViewById<Button>(R.id.btnIMCApp)
        btnGreetApp.setOnClickListener { navigateToGreetApp() }
        btnIMCApp.setOnClickListener { navigateToImcApp() }
    }

    private fun navigateToGreetApp(){
        /***
         * This would be an application:
         * val intent = Intent(this, FirstAppActivity::class.java)
         * startActivity(intent)
         */
    }

    private fun navigateToImcApp(){
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }
}