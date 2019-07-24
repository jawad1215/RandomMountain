package com.example.highestmountain

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

import java.util.Random

class MainActivity : AppCompatActivity() {

    private var button: Button? = null
    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById<View>(R.id.button) as Button
        textView = findViewById<View>(R.id.textView) as TextView
        val mountain = arrayOf("K2", "Everest", "Nanga Parbet", "Rakaposhi", "Ganga", "Tipper")
        button!!.setOnClickListener {
            val random = Random()
            val rn = random.nextInt(mountain.size)

            textView!!.text = mountain[rn]
        }
    }
}
