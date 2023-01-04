package com.example.wattpadku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Cerita_Pendek : AppCompatActivity() {
    private lateinit var img: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cerita_pendek)
        img = findViewById(R.id.img_scan)
        img.setOnClickListener {
            startActivity(Intent(this, Auralaska::class.java))

            img = findViewById(R.id.img_scan1)
            img.setOnClickListener {
                startActivity(Intent(this, Rahasia_Runa::class.java))

                img = findViewById(R.id.img_scan2)
                img.setOnClickListener {
                    startActivity(Intent(this, Selaska_Cinta::class.java))

                    img = findViewById(R.id.img_scan3)
                    img.setOnClickListener {
                        startActivity(Intent(this, My_Rommante::class.java))
                    }
                }
            }
        }
    }
}
