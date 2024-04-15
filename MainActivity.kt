package com.idekhail.asa1_p1
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var username = findViewById<EditText>(R.id.username)
        var password = findViewById<EditText>(R.id.password)

        val login = findViewById<Button>(R.id.login)
        val ok = findViewById<Button>(R.id.ok)
        val clear = findViewById<Button>(R.id.clear)
        val close = findViewById<Button>(R.id.close)

        var show = findViewById<TextView>(R.id.show)

        login.setOnClickListener {
            var i = Intent(this, SecondActivity::class.java)
            startActivity(i)
        }
        ok.setOnClickListener(){
            show.text = username.text.toString() + "    " + password.text.toString()

            ok.isEnabled = false
        }

        clear.setOnClickListener {
            show.text = "Show"
            username.text.clear()
            password.text.clear()
        }

        close.setOnClickListener {
            System.exit(0)
        }

    }
}