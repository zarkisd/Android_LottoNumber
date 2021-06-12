package com.example.lottonumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony
import android.text.Editable
import android.widget.TextView
import android.widget.Toast
import com.example.lottonumber.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        //여기까지 기본 세팅


        binding.btnLogin.setOnClickListener {
            if (binding.tvId.text.toString() == "aa" && binding.tvPw.text.toString() == "aaa") {

                Toast.makeText(this, "aaaaa", Toast.LENGTH_SHORT).show()
            }

        }


    }
}

