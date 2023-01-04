package com.example.wattpadku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var img: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        img = findViewById(R.id.img_scan)
        img.setOnClickListener {
            startActivity(Intent(this, Horor::class.java))

            img = findViewById(R.id.img_scan2)
            img.setOnClickListener {
                startActivity(Intent(this, Cerita_Pendek::class.java))

                img = findViewById(R.id.img_scan3)
                img.setOnClickListener {
                    startActivity(Intent(this, Humor::class.java))

                    img = findViewById(R.id.img_scan4)
                    img.setOnClickListener {
                        startActivity(Intent(this, Laga::class.java))

                        img = findViewById(R.id.img_scan5)
                        img.setOnClickListener {
                            startActivity(Intent(this, Fiksi_Remaja::class.java))

                            img = findViewById(R.id.img_scan6)
                            img.setOnClickListener {
                                startActivity(Intent(this, Petualangan::class.java))




                                }
                            }


                        }
                    }
                }
            }
        }
    }


