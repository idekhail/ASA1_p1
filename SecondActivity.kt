package com.idekhail.asa1_p1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        var  phone_web = findViewById<EditText>(R.id.phone_web)

        var  call = findViewById<Button>(R.id.call)
        var  web = findViewById<Button>(R.id.web)
        var  next = findViewById<Button>(R.id.next)
        var  back = findViewById<Button>(R.id.back)



        call.setOnClickListener {
            val i = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phone_web.text.toString().trim()))
            startActivity(i)
        }
        web.setOnClickListener {

            val i = Intent(Intent.ACTION_VIEW, Uri.parse(phone_web.text.toString().trim()))
            startActivity(i)
        }

        next.setOnClickListener {
            var  i = Intent(this, ThirdActivity::class.java)
            startActivity(i)
        }
        back.setOnClickListener {
            var  i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
    }
}