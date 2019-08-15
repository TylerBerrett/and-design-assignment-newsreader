package com.example.materialdesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_list_page.*

class ListPage : AppCompatActivity() {

    companion object{
        val MAGIC_KEY = "Key"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_page)



        val intent = Intent(this, DetailPage::class.java)

        img_cat.setOnClickListener {
            intent.putExtra(MAGIC_KEY, ImageData(R.drawable.cat, cat_text.text.toString()))
            startActivity(intent)
        }

        img_ice_cream.setOnClickListener {
            intent.putExtra(MAGIC_KEY, ImageData(R.drawable.icecream, icecream_text.text.toString()))
            startActivity(intent)
        }

        img_code.setOnClickListener {
            intent.putExtra(MAGIC_KEY, ImageData(R.drawable.coding, app_text.text.toString()))
            startActivity(intent)
        }

        img_botanical.setOnClickListener {
            intent.putExtra(MAGIC_KEY, ImageData(R.drawable.botanical, botanical_text.text.toString()))
            startActivity(intent)
        }

        img_utah.setOnClickListener {
            intent.putExtra(MAGIC_KEY, ImageData(R.drawable.utah, utah_text.text.toString()))
            startActivity(intent)
        }

    }
}
