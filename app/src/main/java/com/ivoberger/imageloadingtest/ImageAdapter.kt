package com.ivoberger.imageloadingtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.facebook.drawee.view.SimpleDraweeView

class ImageAdapter(itemCount: Int) : BaseAdapter<ImageAdapter.ViewHolder>(itemCount) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.viewholder_image, parent, false)
    )

    class ViewHolder(itemView: View) : BaseViewHolder(itemView) {
        override fun onBind(position: Int) {
            val imgUrl = "https://picsum.photos/id/${position * 2}/500"
            itemView.findViewById<SimpleDraweeView>(R.id.imageView_imageViewHolder)
                .setImageURI(imgUrl)
        }

    }
}
