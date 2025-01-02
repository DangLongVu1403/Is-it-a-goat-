package com.example.optimalapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView

class MyListViewAdapter(
    context: Context,
    private val resourceId: Int,
    private val itemList: List<Item>
) : ArrayAdapter<Item>(context, resourceId, itemList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View
        val viewHolder: ViewHolder

        if (convertView == null) {
            // Inflate layout lần đầu tiên
            view = LayoutInflater.from(context).inflate(resourceId, parent, false)
            viewHolder = ViewHolder(
                view.findViewById(R.id.imageView),
                view.findViewById(R.id.textViewLink),
                view.findViewById(R.id.checkBox),
                view.findViewById(R.id.checkBoxText)
            )
            view.tag = viewHolder
        } else {
            // Tái sử dụng view
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        // Gán dữ liệu cho view
        val item = itemList[position]
        viewHolder.imageView.setImageResource(item.image)
        viewHolder.textViewLink.text = item.linkText
        viewHolder.checkBox.isChecked = item.isChecked
        viewHolder.checkBoxText.text = item.checkBoxText

        // Gắn sự kiện cho CheckBox
        viewHolder.checkBox.setOnCheckedChangeListener { _, isChecked ->
            item.isChecked = isChecked
        }

        return view
    }

    // ViewHolder để tối ưu hóa ListView
    private data class ViewHolder(
        val imageView: ImageView,
        val textViewLink: TextView,
        val checkBox: CheckBox,
        val checkBoxText: TextView
    )
}