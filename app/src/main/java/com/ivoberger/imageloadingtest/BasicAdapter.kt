package com.ivoberger.imageloadingtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import coil.api.load

class BasicAdapter(itemCount: Int) : BaseAdapter<BasicAdapter.BasicViewHolder>(itemCount) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = BasicViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.viewholder_basic, parent, false)
    )

    class BasicViewHolder(itemView: View) : BaseViewHolder(itemView) {
        override fun onBind(position: Int) {
            itemView.findViewById<ImageView>(R.id.imageView_basicViewHolder)
                .load("https://picsum.photos/id/${position * 2}/500")
        }

    }
}
