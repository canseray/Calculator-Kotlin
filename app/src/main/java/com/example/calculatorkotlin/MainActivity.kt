package com.example.calculatorkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sum (view: View){
        val a = number1.text.toString().toInt()
        val b = number2.text.toString().toInt()

        val result = a + b

        textView.text = "Result: $result"   // = "Result: " +result
    }

    fun sub (view: View){
        val a = number1.text.toString().toInt()
        val b = number2.text.toString().toInt()

        val result = a - b

        textView.text = "Result: $result"   // = "Result: " +result

    }

    fun multiply (view: View){
        val a = number1.text.toString().toInt()
        val b = number2.text.toString().toInt()

        val result = a * b

        textView.text = "Result: $result"   // = "Result: " +result

    }

    fun div (view: View){
        val a = number1.text.toString().toInt()
        val b = number2.text.toString().toInt()

        val result = a / b

        textView.text = "Result: $result"   // = "Result: " +result

    }
}

