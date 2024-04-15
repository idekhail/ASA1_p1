package com.idekhail.asb1_p1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import java.time.Instant

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val  phone_web = findViewById<EditText>(R.id.phone_web)

        val call = findViewById<Button>(R.id.call)
        var  web = findViewById<Button>(R.id.web)
        var  back = findViewById<Button>(R.id.back)
        var  next = findViewById<Button>(R.id.next)

        call.setOnClickListener(View.OnClickListener {
            val number = phone_web.text.toString().trim()
            val i = Intent(Intent.ACTION_CALL, )
            i.data = Uri.parse("tel:$number")
            startActivity(i)
        })
        web.setOnClickListener {
            val uri = phone_web.text.toString()

            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(uri)
            startActivity(i)
        }

        back.setOnClickListener {
            var  i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

        next.setOnClickListener {
            var  i = Intent(this, MapActivity::class.java)
            startActivity(i)
        }


    }
}