package com.example.lottonumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony
import android.text.Editable
import android.widget.TextView
import android.widget.Toast
import com.example.lottonumber.databinding.ActivityMainBinding
import splitties.activities.start
import splitties.toast.toast

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        //여기까지 기본 세팅


        binding.btnLogin.setOnClickListener {
            // 나중에 조건을 sqllite나 db에서 가져와서 확인하는걸로 바꾸기
            if (binding.tvId.text.toString() == "aa" && binding.tvPw.text.toString() == "aaa") {

                toast("성공!")
                start<SubActivity>()


            }
            else {
                toast("아이디가 없어요")
            }

        }


    }
}

