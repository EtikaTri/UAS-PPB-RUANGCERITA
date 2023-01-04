package com.example.wattpadku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Horor : AppCompatActivity() {
    private lateinit var img:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_horor)
        img = findViewById(R.id.img_scan)
        img.setOnClickListener {
            startActivity(Intent(this, Rumah_Dukun::class.java))

            img = findViewById(R.id.img_scan1)
            img.setOnClickListener {
                startActivity(Intent(this, Rumah_Nenek::class.java))

            img = findViewById(R.id.img_scan2)
            img.setOnClickListener {
                    startActivity(Intent(this, Rumah_Arwah::class.java))

                img = findViewById(R.id.img_scan3)
                img.setOnClickListener {
                    startActivity(Intent(this, Rumah_Penghuni::class.java))



                img = findViewById(R.id.img_scan4)
                img.setOnClickListener {
                    startActivity(Intent(this, Rumah_PitungDino::class.java))


                }


                }
                }
            }
        }


    }
}