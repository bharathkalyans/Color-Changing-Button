package com.bharathkalyans.practice

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners(){
        hello_button.setOnClickListener { displayMessage(it) }
        color_changer.setOnClickListener {  changeColor(it) }

    }

    private fun displayMessage(textView : View){
        Toast.makeText(this, "Hey You Clicked a Goddamn Button", Toast.LENGTH_SHORT).show()
    }

    private fun changeColor(view : View){

        val random : Random = Random
        val randomC = Color.argb(255,random.nextInt(256),
                random.nextInt(256),random.nextInt(256))

        val randomCC = Color.argb(255,random.nextInt(256),
                random.nextInt(256),random.nextInt(256))

        view.setBackgroundColor(randomC)//Button's BackGround



    }


}