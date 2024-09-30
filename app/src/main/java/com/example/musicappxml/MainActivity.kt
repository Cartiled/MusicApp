package com.example.musicappxml

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val playbutton = findViewById<ImageView>(R.id.playButton)

            playbutton.setOnClickListener{
                if(playbutton.isPressed){
                    playbutton.setImageResource(R.drawable.pause)
                }else {
                    playbutton.setImageResource(R.drawable.pngwing_com__3_)
                }
            }

        }
    }
