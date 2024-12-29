package com.example.optimalapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById(R.id.recycleView)
        recyclerView.layoutManager = LinearLayoutManager(this)
//        val fib40 = fib(40)
//        Toast.makeText(this,"fibonaci với n = 40 là: $fib40", Toast.LENGTH_LONG).show()

        // Dữ liệu mẫu
        val itemList = listOf(
            Item(R.drawable.bo, "https://example.com", false, "Option 1"),
            Item(R.drawable.goat01, "https://example.org", true, "Option 2"),
            Item(R.drawable.goat02, "https://example.com", false, "Option 1"),
            Item(R.drawable.buffalo, "https://example.org", true, "Option 2"),
            Item(R.drawable.bo, "https://example.com", false, "Option 1"),
            Item(R.drawable.goat04, "https://example.com", false, "Option 1"),
            Item(R.drawable.buffalo, "https://example.org", true, "Option 2"),
            Item(R.drawable.goat03, "https://example.com", false, "Option 1"),
            Item(R.drawable.buffalo, "https://example.org", true, "Option 2"),
            Item(R.drawable.goat05, "https://example.com", false, "Option 1"),
            Item(R.drawable.buffalo, "https://example.org", true, "Option 2"),
            Item(R.drawable.bo, "https://example.com", false, "Option 1"),
            Item(R.drawable.goat01, "https://example.org", true, "Option 2"),
            Item(R.drawable.goat02, "https://example.com", false, "Option 1"),
            Item(R.drawable.buffalo, "https://example.org", true, "Option 2"),
            Item(R.drawable.bo, "https://example.com", false, "Option 1"),
            Item(R.drawable.buffalo, "https://example.org", true, "Option 2"),
            Item(R.drawable.goat04, "https://example.com", false, "Option 1"),
            Item(R.drawable.buffalo, "https://example.org", true, "Option 2"),
            Item(R.drawable.goat03, "https://example.com", false, "Option 1"),
            Item(R.drawable.buffalo, "https://example.org", true, "Option 2"),
            Item(R.drawable.goat05, "https://example.com", false, "Option 1"),
            Item(R.drawable.buffalo, "https://example.org", true, "Option 2"),
            Item(R.drawable.bo, "https://example.com", false, "Option 1"),
            Item(R.drawable.goat01, "https://example.org", true, "Option 2"),
            Item(R.drawable.goat02, "https://example.com", false, "Option 1"),
            Item(R.drawable.buffalo, "https://example.org", true, "Option 2"),
            Item(R.drawable.bo, "https://example.com", false, "Option 1"),
            Item(R.drawable.buffalo, "https://example.org", true, "Option 2"),
            Item(R.drawable.goat04, "https://example.com", false, "Option 1"),
            Item(R.drawable.buffalo, "https://example.org", true, "Option 2"),
            Item(R.drawable.goat03, "https://example.com", false, "Option 1"),
            Item(R.drawable.buffalo, "https://example.org", true, "Option 2"),
            Item(R.drawable.goat05, "https://example.com", false, "Option 1"),
            Item(R.drawable.buffalo, "https://example.org", true, "Option 2")
        )

//        val adapter = MyAdapter(itemList, isOptimized = true) // Để hiển thị layout tối ưu hóa
        val adapter = MyAdapter(itemList, isOptimized = false) // Để hiển thị layout gốc
        recyclerView.adapter = adapter

    }

//    fun fib(n: Int): Int {
//        if (n <= 0) return 0
//        if (n == 1) return 1
//        return fib(n - 1) + fib(n - 2)
//    }
}