package com.ivoberger.imageloadingtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ImageAdapter(itemCount: Int) : BaseAdapter<ImageAdapter.BasicViewHolder>(itemCount) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = BasicViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.viewholder_basic, parent, false)
    )

    class BasicViewHolder(itemView: View) : BaseViewHolder(itemView) {
        override fun onBind(position: Int) {
            val imgUrl = "https://picsum.photos/id/${position * 2}/500"
            // TODO load image into image view
        }

    }
}
