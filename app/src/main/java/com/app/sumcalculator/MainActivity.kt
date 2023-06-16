package com.app.sumcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val firstEt:EditText = findViewById(R.id.firstEt)
        val secondEt:EditText = findViewById(R.id.secondEt)
        val resultTxt:TextView = findViewById(R.id.resultTxt)
        val sumBtn:Button = findViewById(R.id.sumBtn)


        sumBtn.setOnClickListener {

            if(!firstEt.text.toString().equals("") && !secondEt.text.toString().equals("")){
                val answer= firstEt.text.toString().toBigInteger() + secondEt.text.toString().toBigInteger()
                resultTxt.text="SUM: $answer"
            } else{
                Toast.makeText(this,"Please enter valid inputs!",Toast.LENGTH_SHORT).show()
            }

        }





    }
}