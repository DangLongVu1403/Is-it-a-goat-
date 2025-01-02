package com.example.optimalapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewStub
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter(
    private val context: Context,
    private val layoutIds: List<Int>
) : RecyclerView.Adapter<ViewPagerAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val viewStub: ViewStub = itemView.findViewById(R.id.viewStub)
        var isInflated = false  // Flag để kiểm tra đã inflate hay chưa
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_view_pager, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Kiểm tra nếu tab chưa được inflate thì mới tiến hành inflate
        if (!holder.isInflated) {
            holder.viewStub.layoutResource = layoutIds[position]
            holder.viewStub.inflate()
            holder.isInflated = true
        }
    }

    override fun getItemCount() = layoutIds.size
}
