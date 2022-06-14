package com.example.myapplication6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculatrice (view: View) {
        var nbr1 = editText.text.toString().toInt()
        var nbr2 = editText2.text.toString().toInt()
        var init = 0
        var calcul = ""
        when (view.id) {
            R.id.button1 -> calcul = "+"
            R.id.button2 -> calcul = "-"
            R.id.button3 -> calcul = "/"
            R.id.button4 -> calcul = "*"
        }

        if (calcul == "-") {
            init = nbr1 - nbr2
        }
       else if (calcul == "+") {
            init = nbr1 + nbr2
        }
        else if (calcul == "/") {
            init = nbr1 / nbr2
        }
        else if (calcul== "*") {
            init = nbr1 * nbr2
        }
        result.text = calcul.toString()
    }
}