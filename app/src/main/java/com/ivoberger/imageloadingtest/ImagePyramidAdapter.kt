package com.ivoberger.imageloadingtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class ImagePyramidAdapter(itemCount: Int) :
    BaseAdapter<ImagePyramidAdapter.ViewHolder>(itemCount) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.viewholder_image_pyramid,
            parent,
            false
        )
    )

    class ViewHolder(itemView: View) : BaseViewHolder(itemView) {
        override fun onBind(position: Int) {
            val imgUrl = "https://picsum.photos/id/${position * 2}/500"
            val imageViews = listOf<ImageView>(
                itemView.findViewById(R.id.imageView_imagePyramidViewHolder_1),
                itemView.findViewById(R.id.imageView_imagePyramidViewHolder_2),
                itemView.findViewById(R.id.imageView_imagePyramidViewHolder_3),
                itemView.findViewById(R.id.imageView_imagePyramidViewHolder_4)
            )
            imageViews.forEach { imageView ->
                // TODO load image into image views
            }
        }

    }
}
