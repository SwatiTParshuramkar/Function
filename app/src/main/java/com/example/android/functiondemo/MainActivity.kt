package com.example.android.functiondemo

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener{

    lateinit var oneEdit: EditText
    lateinit var twoEdit: EditText

    lateinit var btOne: Button
    lateinit var btTwo: Button
    lateinit var btThree: Button
    lateinit var btFour: Button
    lateinit var tvtResult: TextView

    var numberOne:String? = null
    var numberTwo:String? = null


    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        initView()

      }


    fun initView() {
        oneEdit = findViewById(R.id.edtOne)
        twoEdit = findViewById(R.id.edtTwo)

        btOne = findViewById(R.id.btnOne)
        btTwo = findViewById(R.id.btnTwo)
        btThree = findViewById(R.id.btnThree)
        btFour = findViewById(R.id.btnFour)

        tvtResult = findViewById(R.id.tvResult)

        onClickListener()
    }

    fun onClickListener() {
        btOne.setOnClickListener(this)
        btTwo.setOnClickListener (this)
        btThree.setOnClickListener(this)
        btFour.setOnClickListener(this)

    }

    fun add(numOne: Int, numTwo: Int): Int {
        val result = numOne + numTwo
        return result
    }


    fun sub(numOne: Int, numTwo: Int): Int {
        val result = numOne - numTwo
        return result

    }

    fun multifly(numOne: Int, numTwo: Int): Int {
        val result = numOne  * numTwo
        return result

    }

    fun div(numOne: Int, numTwo: Int): Int {
        val result = numOne / numTwo
        return result

    }

    override fun onClick(v: View?){
        when(v?.id){
            R.id.btnOne ->{
                numberOne = oneEdit.text.toString()
                numberTwo = twoEdit.text.toString()
                tvtResult.text= add(numberOne!!.toInt(), numberTwo!!.toInt()).toString()

            }
            R.id.btnTwo -> {
                numberOne = oneEdit.text.toString()
                numberTwo = twoEdit.text.toString()
                tvtResult.text=sub(numberOne!!.toInt(), numberTwo!!.toInt()).toString()
            }
            R.id.btnThree -> {
                numberOne = oneEdit.text.toString()
                numberTwo = twoEdit.text.toString()
                tvtResult.text= multifly(numberOne!!.toInt(), numberTwo!!.toInt()).toString()
            }
            R.id.btnFour -> {
                numberOne = oneEdit.text.toString()
                numberTwo = twoEdit.text.toString()
                tvtResult.text=div(numberOne!!.toInt(), numberTwo!!.toInt()).toString()
            }
        }
    }


}





