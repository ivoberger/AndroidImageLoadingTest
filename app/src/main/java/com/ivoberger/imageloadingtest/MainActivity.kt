package com.ivoberger.imageloadingtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView_main_imageList.apply {
            //            layoutManager = GridLayoutManager(this@MainActivity, 3)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = MultiImageAdapter(100)
        }
    }
}
