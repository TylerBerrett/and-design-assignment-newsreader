package com.example.materialdesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_page.*
import kotlinx.android.synthetic.main.activity_list_page.*

class DetailPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_page)

       val data = intent.getSerializableExtra(ListPage.MAGIC_KEY) as ImageData

        img_location.background = resources.getDrawable(data.imageLocation, null)
        detail_title.text = data.title

    }
}
