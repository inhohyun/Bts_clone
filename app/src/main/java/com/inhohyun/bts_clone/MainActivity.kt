package com.inhohyun.bts_clone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1. 화면이 클릭되었다는 것을 알려줌
        val image1 = findViewById<ImageView>(R.id.bts_image_1)
        image1.setOnClickListener{


            Toast.makeText(this,"1번 클릭 완료", Toast.LENGTH_SHORT).show()

            //2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여줌!
            val intent = Intent(this, BtsActivity1::class.java)
            startActivity(intent)

        }

    }
}