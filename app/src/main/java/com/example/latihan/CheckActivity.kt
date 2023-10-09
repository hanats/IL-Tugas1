package com.example.latihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class CheckActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etTinggiBadan: EditText
    private lateinit var etBeratBadan: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check)

        etTinggiBadan = findViewById(R.id.edt_tinggiBadan)
        etBeratBadan = findViewById(R.id.edt_beratBadan)

        val btnHasil: Button = findViewById(R.id.btn_hasil)
        btnHasil.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.btn_hasil -> {
                val bundle = Bundle()
                bundle.putString("username",etTinggiBadan.text.toString())
                bundle.putString("password", etBeratBadan.text.toString())


                val intent = Intent(this@CheckActivity, FinalActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }

        }


    }
}