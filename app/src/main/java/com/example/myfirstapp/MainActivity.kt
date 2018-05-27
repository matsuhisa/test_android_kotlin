package com.example.myfirstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View?) {
        //  Do something in response to button
        val intent =  Intent(this, DisplayMessageActivity::class.java)
        intent.putExtra(EXTRA_MESSAGE, editText.text.toString())
        startActivity(intent)
    }
}
