package com.ivoberger.imageloadingtest

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var isGridActive = true
    private val itemCount = 100
    private val gridColumns = 3

    private lateinit var switchMenuItem: MenuItem

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView_main_imageList.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = ImagePyramidAdapter(100)
        }
    }

    private fun loadImageGrid() = recyclerView_main_imageList.apply {
        layoutManager = GridLayoutManager(this@MainActivity, gridColumns)
        adapter = ImageAdapter(itemCount * gridColumns)

    }

    private fun loadImagePyramidList() = recyclerView_main_imageList.apply {
        layoutManager = LinearLayoutManager(this@MainActivity)
        adapter = ImagePyramidAdapter(itemCount)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.actionbar, menu)
        switchMenuItem = menu!!.findItem(R.id.menuitem_switch_layout)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        item ?: return false
        when (item.itemId) {
            R.id.menuitem_switch_layout -> {
                if (isGridActive) {
                    switchMenuItem.setIcon(R.drawable.ic_grid)
                    loadImagePyramidList()
                } else {
                    switchMenuItem.setIcon(R.drawable.ic_list)
                    loadImageGrid()
                }
                isGridActive = !isGridActive
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
