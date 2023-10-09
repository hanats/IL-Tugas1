package com.example.latihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class FinalActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etTinggiBadan: EditText
    private lateinit var etBeratBadan: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        etTinggiBadan = findViewById(R.id.edt_tinggiBadan)
        etBeratBadan = findViewById(R.id.edt_beratBadan)

        val bundle = intent.extras
        if(bundle != null){
            etTinggiBadan.setText(bundle.getString("username"))
            etBeratBadan.setText(bundle.getString("password"))

        }

        val btnLogin: Button = findViewById(R.id.btn_hasil)
        btnLogin.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.btn_hasil -> {
                val intent = Intent(this@FinalActivity, MainActivity::class.java)
                startActivity(intent)
            }

        }
    }
}