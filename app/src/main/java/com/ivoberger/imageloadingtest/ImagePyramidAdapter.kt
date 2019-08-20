package com.ivoberger.imageloadingtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.squareup.picasso.Picasso

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
                itemView.findViewById(R.id.imageView_multiImageViewHolder_1),
                itemView.findViewById(R.id.imageView_multiImageViewHolder_2),
                itemView.findViewById(R.id.imageView_multiImageViewHolder_3),
                itemView.findViewById(R.id.imageView_multiImageViewHolder_4)
            )
            imageViews.forEach { imageView ->
                Picasso.get().load(imgUrl).into(imageView)
            }
        }

    }
}
