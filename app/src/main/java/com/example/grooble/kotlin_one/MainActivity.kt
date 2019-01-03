package com.example.grooble.kotlin_one

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import org.jetbrains.anko.toast
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var submitButton: Button
    private lateinit var problemView : View
    private lateinit var answerView: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Click to accept answer
        submitButton = findViewById(R.id.submit_button) as Button
        submitButton.setOnClickListener{
            toast("hi there")
        }
        fun makeQuestion(): String{
            Random.
        }
    }

}
