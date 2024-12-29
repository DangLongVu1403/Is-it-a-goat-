package com.example.optimalapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.io.BufferedReader
import java.io.InputStreamReader

class FibonaciActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fibonaci)
        val fib40 = fib(40)
        Toast.makeText(this,"fibonaci với n = 40 là: $fib40", Toast.LENGTH_LONG).show()
    }

    fun fib(n: Int): Int {
        if (n <= 0) return 0
        if (n == 1) return 1
        return fib(n - 1) + fib(n - 2)
    }

}