package com.example.materialdesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, ListPage::class.java)
        val intent2 = Intent(this, vivek::class.java)


        button_log_in.setOnClickListener {
            if(input_username.text.toString().toLowerCase() == "vivek" && input_password.text.toString().toLowerCase() == "vishwanath"){
                startActivity(intent2)
            }
            else startActivity(intent)
        }


    }
}
