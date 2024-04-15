package com.idekhail.asb1_p1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        val  latitude = findViewById<EditText>(R.id.latitude)
        val  longitude = findViewById<EditText>(R.id.longitude)

        val map = findViewById<Button>(R.id.map)
        var  back = findViewById<Button>(R.id.back)

        map.setOnClickListener {
            var w = latitude.text.toString().trim()
            var t = longitude.text.toString()


            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse("geo:$w,$t")
            val chooser = Intent.createChooser(i,"open map")
            startActivity(chooser)
        }

        back.setOnClickListener {
            var  i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

    }
}