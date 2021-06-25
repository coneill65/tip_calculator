package com.example.tip_calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnProfile = findViewById<Button>(R.id.calculateButton)
        btnProfile.setOnClickListener{

            val spinnerVar = findViewById<Spinner>(R.id.percentageSpinner).selectedItem.toString().toInt()
            val mealCost = findViewById<EditText>(R.id.costOfMeal).text.toString().toDouble()

            val tip = (spinnerVar * 0.01) * mealCost
            val currency = DecimalFormat("###,###.00")

            val output = findViewById<TextView>(R.id.resultText)
            output.text = "The tip due for $spinnerVar% of ${currency.format(mealCost)}$ is ${currency.format(tip)}$"
        }
    }
}