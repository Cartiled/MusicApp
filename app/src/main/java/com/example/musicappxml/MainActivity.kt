package com.example.musicappxml

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private  var imagenOriginal = true
    private lateinit var playButton:ImageView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        playButton = findViewById<ImageView>(R.id.playButton)
        playButton.setOnClickListener{
                if(imagenOriginal){
                    playButton.setImageResource(R.drawable.pause)
                }else {
                    playButton.setImageResource(R.drawable.pngwing_com__3_)
                }
            imagenOriginal = !imagenOriginal;
            }

        }
    }
