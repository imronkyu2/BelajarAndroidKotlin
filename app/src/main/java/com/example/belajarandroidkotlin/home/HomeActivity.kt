package com.example.belajarandroidkotlin.home

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.belajarandroidkotlin.R
import com.example.belajarandroidkotlin.barvolume.BarVolumeActivity
import com.example.belajarandroidkotlin.intentmovewithdata.MoveWithDataActivity
import com.example.belajarandroidkotlin.viewandviewgroup.MyViewAndViewsActivity

class HomeActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_intent_barvolume: Button = findViewById(R.id.btn_BarVolume)
        btn_intent_barvolume.setOnClickListener(this)
        val btn_MoveWithData: Button = findViewById(R.id.btn_MoveWithData)
        btn_MoveWithData.setOnClickListener(this)
        val btn_dial_number: Button = findViewById(R.id.btn_dial_number)
        btn_dial_number.setOnClickListener(this)
        val btn_MyViewAndViewsr: Button = findViewById(R.id.btn_MyViewAndViewsr)
        btn_MyViewAndViewsr.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0?.id){

            R.id.btn_BarVolume -> {
                val intent = Intent(this, BarVolumeActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_MoveWithData -> {
                val moveWithDataIntent = Intent(this@HomeActivity, MoveWithDataActivity::class.java)
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "DicodingAcademy Boy")
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 5)
                startActivity(moveWithDataIntent)
            }
            R.id.btn_dial_number -> {
                val phoneNumber = "081210841382"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)
            }
            R.id.btn_MyViewAndViewsr -> {
                val intent = Intent(this, MyViewAndViewsActivity::class.java)
                startActivity(intent)
            }
        }
    }
}