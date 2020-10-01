package org.somenath1435.mylibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import org.somenath1435.mylibrarymodule.MathUtils

class MainActivity : AppCompatActivity() {
    private lateinit var num1: EditText
    private lateinit var num2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num1 = findViewById(R.id.num1)
        num2 = findViewById(R.id.num2)
    }

    fun add(view: View) {
        val n1 = num1.text.toString().toInt()
        val n2 = num2.text.toString().toInt()
        val ans = MathUtils.add(n1, n2)
        Toast.makeText(this, "Sum is $ans", Toast.LENGTH_LONG).show()
    }

    fun sub(view: View) {
        val n1 = num1.text.toString().toInt()
        val n2 = num2.text.toString().toInt()
        val ans = MathUtils.sub(n1, n2)
        Toast.makeText(this, "Difference is $ans", Toast.LENGTH_LONG).show()
    }

    fun mul(view: View) {
        val n1 = num1.text.toString().toInt()
        val n2 = num2.text.toString().toInt()
        val ans = MathUtils.mul(n1, n2)
        Toast.makeText(this, "Product is $ans", Toast.LENGTH_LONG).show()
    }

    fun div(view: View) {
        val n1 = num1.text.toString().toInt()
        val n2 = num2.text.toString().toInt()
        val ans = MathUtils.div(n1, n2)
        Toast.makeText(this, "Quotient is $ans", Toast.LENGTH_LONG).show()
    }
}
