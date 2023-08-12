package com.example.calculator2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnAC = findViewById<Button>(R.id.btnAc)
        var btnErase = findViewById<ImageButton>(R.id.btnX)
        var btnDiv = findViewById<Button>(R.id.btnDiv)
        var btnSeven = findViewById<Button>(R.id.btn7)
        var btnEight = findViewById<Button>(R.id.btn8)
        var btnNine = findViewById<Button>(R.id.btn9)
        var btnMul = findViewById<Button>(R.id.btnMul)
        var btnFour = findViewById<Button>(R.id.btn4)
        var btnFive = findViewById<Button>(R.id.btn5)
        var btnSix = findViewById<Button>(R.id.btn6)
        var btnMinus = findViewById<Button>(R.id.btnMinus)
        var btnOne = findViewById<Button>(R.id.btn1)
        var btnTwo = findViewById<Button>(R.id.btn2)
        var btnThree = findViewById<Button>(R.id.btn3)
        var btnPlus = findViewById<Button>(R.id.btnPlus)
        var btnDot = findViewById<Button>(R.id.btnDot)
        var btnZero = findViewById<Button>(R.id.btn0)
        var btnEquals = findViewById<Button>(R.id.btnEqual)
        var tvInput = findViewById<TextView>(R.id.tvInput)
        var btnMod = findViewById<Button>(R.id.btnMod)

        btnSeven.setOnClickListener{
            tvInput.append("7")
        }
        btnAC.setOnClickListener {
            tvInput.text=""
        }
        btnErase.setOnClickListener {
            var input= tvInput.text.toString()
            if(input.isNotEmpty()) {
                var inp = input.substring(0, input.length - 1)
                tvInput.text = inp
            }
        }
        btnSix.setOnClickListener{
            tvInput.append("6")
        }
        btnEight.setOnClickListener{
            tvInput.append("8")
        }
        btnNine.setOnClickListener{
            tvInput.append("9")
        }
        btnFive.setOnClickListener{
            tvInput.append("5")
        }
        btnFour.setOnClickListener{
            tvInput.append("4")
        }
        btnThree.setOnClickListener{
            tvInput.append("3")
        }
        btnTwo.setOnClickListener{
            tvInput.append("2")
        }
        btnOne.setOnClickListener{
            tvInput.append("1")
        }
        btnZero.setOnClickListener{
            tvInput.append("0")
        }
        btnPlus.setOnClickListener{
            if(!tvInput.text.toString().contains("+"))
                if(!tvInput.text.toString().contains("-"))
                    if(!tvInput.text.toString().contains("*"))
                        if(!tvInput.text.toString().contains("/"))
                            if(!tvInput.text.toString().contains("%"))
                                tvInput.append("+")
        }
        btnMinus.setOnClickListener{
            if(!tvInput.text.toString().contains("+"))
                if(!tvInput.text.toString().contains("-"))
                    if(!tvInput.text.toString().contains("*"))
                        if(!tvInput.text.toString().contains("/"))
                            if(!tvInput.text.toString().contains("%"))
                                tvInput.append("-")
        }
        btnMul.setOnClickListener{
            if(!tvInput.text.toString().contains("+"))
                if(!tvInput.text.toString().contains("-"))
                    if(!tvInput.text.toString().contains("*"))
                        if(!tvInput.text.toString().contains("/"))
                            if(!tvInput.text.toString().contains("%"))
                                tvInput.append("*")
        }
        btnDiv.setOnClickListener{
            if(!tvInput.text.toString().contains("+"))
                if(!tvInput.text.toString().contains("-"))
                    if(!tvInput.text.toString().contains("*"))
                        if(!tvInput.text.toString().contains("/"))
                            if(!tvInput.text.toString().contains("%"))
                                tvInput.append("/")
        }
        btnDot.setOnClickListener{
            tvInput.append(".")
        }
        btnMod.setOnClickListener{
            if(!tvInput.text.toString().contains("+"))
                if(!tvInput.text.toString().contains("-"))
                    if(!tvInput.text.toString().contains("*"))
                        if(!tvInput.text.toString().contains("/"))
                            if(!tvInput.text.toString().contains("%"))
                                tvInput.append("%")
        }
        btnEquals.setOnClickListener {
            var str= tvInput.text.toString()
            var v1 = 0.0f
            var v2 = 0.0f
            var result=""
            if(str.contains("+")){
                var arr= str.split("+")
                v1=arr[0].toFloat()
                v2=arr[1].toFloat()
                result=(v1+v2).toString()
                if(result.contains(".0")){
                    result=result.substring(0,result.length-2)
                }
                tvInput.text= result
            }
           if(str.contains("-")){
                var arr= str.split("-")
               v1=arr[0].toFloat()
               v2=arr[1].toFloat()
               result=(v1-v2).toString()
               if(result.contains(".0")){
                   result=result.substring(0,result.length-2)
               }
                tvInput.text= result.toString()
            }
            if(str.contains("*")){
                var arr= str.split("*")
                v1=arr[0].toFloat()
                v2=arr[1].toFloat()
                result=(v1*v2).toString()
                if(result.contains(".0")){
                    result=result.substring(0,result.length-2)
                }
                tvInput.text= result.toString()
            }
            if(str.contains("/")){
                var arr= str.split("/")
                v1=arr[0].toFloat()
                v2=arr[1].toFloat()
                result=(v1/v2).toString()
                if(result.contains(".0")){
                    result=result.substring(0,result.length-2)
                }
                tvInput.text= result.toString()
            }
            if(str.contains("%")){
                var arr= str.split("%")
                v1=arr[0].toFloat()
                v2=arr[1].toFloat()
                result=(v1%v2).toString()
                if(result.contains(".0")){
                    result=result.substring(0,result.length-2)
                }
                tvInput.text= result.toString()
            }

        }
    }


}
