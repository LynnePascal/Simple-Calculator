package com.pascal.appbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var input1: EditText= findViewById(R.id.input1)
        var input2: EditText= findViewById(R.id.input2)
        var myButton: Button= findViewById(R.id.buttonAdd)
        var myResult: TextView= findViewById(R.id.textResult)

       //listener
        myButton.setOnClickListener {
            //var total= input1.text.toString().toDouble()+input2.text.toString().toDouble()
            //get the text that user has entered
            var firstText= input1.text.toString().trim()
            var secondText= input2.text.toString().trim()

            if (firstText.isEmpty() || secondText.isEmpty()){
                Toast.makeText(applicationContext, "Please enter all values", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            try {


                //convert to numbers
                var firstNumber = firstText.toDouble()//99
                var secondNumber = secondText.toDouble()

                //add the two numbers
                var sum = firstNumber + secondNumber

                //display
                myResult.text = "Sum is $sum"
            }catch (e : Exception){
                Toast.makeText(applicationContext, "Please valid input", Toast.LENGTH_SHORT).show()

            }
        }
    }
}

// Create an app that will calculate the compound interest
// amount, rate, period
//display the total amount