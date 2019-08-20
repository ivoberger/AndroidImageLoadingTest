package com.ivoberger.imageloadingtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import coil.api.load

class MultiImageAdapter(itemCount: Int) :
    BaseAdapter<MultiImageAdapter.MultiImageViewHolder>(itemCount) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MultiImageViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.viewholder_multiimage, parent, false)
    )

    class MultiImageViewHolder(itemView: View) : BaseViewHolder(itemView) {
        override fun onBind(position: Int) {
            val imgUrl = "https://picsum.photos/id/${position * 2}/500"
            itemView.findViewById<ImageView>(R.id.imageView_multiImageViewHolder_1).load(imgUrl)
            itemView.findViewById<ImageView>(R.id.imageView_multiImageViewHolder_2).load(imgUrl)
            itemView.findViewById<ImageView>(R.id.imageView_multiImageViewHolder_3).load(imgUrl)
            itemView.findViewById<ImageView>(R.id.imageView_multiImageViewHolder_4).load(imgUrl)
        }

    }
}
