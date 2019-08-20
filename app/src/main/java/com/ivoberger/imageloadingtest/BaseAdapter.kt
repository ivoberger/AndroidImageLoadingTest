package com.ivoberger.imageloadingtest

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseAdapter<T : BaseViewHolder>(private val itemCount: Int) :
    RecyclerView.Adapter<T>() {

    override fun getItemCount() = itemCount

    override fun onBindViewHolder(holder: T, position: Int) = holder.onBind(position)
}

abstract class BaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    abstract fun onBind(position: Int)
}
