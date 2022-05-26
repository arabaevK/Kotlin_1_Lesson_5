package com.example.kotlin_1_lesson_5

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isInvisible
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    private var TextView: TextView? = null
    private var Button: Button? = null
    private var sum = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TextView = findViewById(R.id.text_view)
        Button = findViewById(R.id.button)
        Button?.setOnClickListener {
            if (sum != 10) {
                Button?.text = "+1"
                sum++
            } else {
                Button?.text = "-1"
                sum = 0
            }
            TextView?.text = sum.toString()
        }
    }

}
