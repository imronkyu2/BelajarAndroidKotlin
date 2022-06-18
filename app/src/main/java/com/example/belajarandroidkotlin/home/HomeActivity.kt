package com.example.belajarandroidkotlin.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.belajarandroidkotlin.R
import com.example.belajarandroidkotlin.barvolume.BarVolumeActivity

class HomeActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btn_intent_barvolume : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_intent_barvolume = findViewById(R.id.btn_intent_barvolume)

        btn_intent_barvolume.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        if (p0?.id == R.id.btn_intent_barvolume){
            val intent = Intent(this, BarVolumeActivity::class.java)
            startActivity(intent)
        }
    }
}