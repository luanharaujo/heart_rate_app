package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var butt : Button = findViewById(R.id.button)

        butt.setOnClickListener{
            var txt : TextView = findViewById(R.id.hello)
            txt.text = "Bem vindo à turma de Introdução aos Sistemas Embarcados"
        }
    }
}