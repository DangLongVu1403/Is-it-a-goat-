package com.example.optimalapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(
    private val itemList: List<Item>,
    private val isOptimized: Boolean // Thêm tham số để quyết định layout
) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textViewLink: TextView = itemView.findViewById(R.id.textViewLink)
        val checkBox: CheckBox = itemView.findViewById(R.id.checkBox)
        val checkBoxText: TextView = itemView.findViewById(R.id.checkBoxText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Dựa vào isOptimized để chọn layout phù hợp
        val layoutId = if (isOptimized) R.layout.item_layout_optimal else R.layout.item_layout
        val view = LayoutInflater.from(parent.context).inflate(layoutId, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itemList[position]

        holder.imageView.setImageResource(item.image)

        // Hiển thị đường link
        holder.textViewLink.text = item.linkText

        // CheckBox và văn bản của nó
        holder.checkBox.isChecked = item.isChecked
        holder.checkBoxText.text = item.checkBoxText

        // Gắn sự kiện (nếu cần)
        holder.checkBox.setOnCheckedChangeListener { _, isChecked ->
            item.isChecked = isChecked
        }
    }

    override fun getItemCount(): Int = itemList.size
}
