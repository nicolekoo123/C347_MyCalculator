package sg.edu.rp.c346.id19047433.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var nums = ""
    var addBool = false
    var addNumber = 0.0
    var minusBool = false
    var minusNumber = 0.0
    var timesBool = false
    var timesNumber = 0.0
    var devideBool = false
    var devideNumber = 0.0
    var dotBoolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAC.setOnClickListener {
            editText.text = ""
            nums = ""
        }
    }

    fun btnOnClick(view: View) {
        val btnSelected = view as Button
        when(btnSelected.id) {
            btn9.id -> nums += "9"
            btn8.id -> nums += "8"
            btn7.id -> nums += "7"
            btn6.id -> nums += "6"
            btn5.id -> nums += "5"
            btn4.id -> nums += "4"
            btn3.id -> nums += "3"
            btn2.id -> nums += "2"
            btn1.id -> nums += "1"
            btn0.id -> nums += "0"
        }
        if (!nums.contains(".")){
            //Log.d("no .", "no .")
            when(btnSelected.id) {
                btnDot.id -> nums += "."
            }
        }

        editText.text = nums
        Log.d("nums", nums)
    }

    fun addOnClick (view: View) {
        val btnSelected = view as Button
        when(btnSelected.id) {
            btnPlus.id -> addNumber = editText.text.toString().toDouble()
        }
        Log.d("addNumber", addNumber.toString())
        addBool = true
        minusBool = false
        timesBool = false
        devideBool = false
        nums = ""
        editText.text = ""
    }

    fun MinusOnClick (view: View) {
        val btnSelected = view as Button
        when(btnSelected.id) {
            btnMinus.id -> minusNumber = editText.text.toString().toDouble()
        }
        Log.d("minusNumber", minusNumber.toString())
        addBool = false
        minusBool = true
        timesBool = false
        devideBool = false
        nums = ""
        editText.text = ""
    }

    fun TimesOnClick (view: View) {
        val btnSelected = view as Button
        when(btnSelected.id) {
            btnTimes.id -> timesNumber = editText.text.toString().toDouble()
        }
        Log.d("timesNumber", timesNumber.toString())
        addBool = false
        minusBool = false
        timesBool = true
        devideBool = false
        nums = ""
        editText.text = ""
    }
    fun DevideOnClick (view: View) {
        val btnSelected = view as Button
        when(btnSelected.id) {
            btnDivide.id -> devideNumber = editText.text.toString().toDouble()
        }
        Log.d("devideNumber", devideNumber.toString())
        addBool = false
        minusBool = false
        timesBool = false
        devideBool = true
        nums = ""
        editText.text = ""
    }

    fun EqualOnClick (view: View) {
        var answer = 0.0
        if (addBool) {
            val btnSelected = view as Button
            when(btnSelected.id) {
                btnEqual.id -> answer = addNumber + editText.text.toString().toDouble()
            }
            editText.text = answer.toString()
            Log.d("answer", answer.toString())
        }
        else if (minusBool) {
            val btnSelected = view as Button
            when(btnSelected.id) {
                btnEqual.id -> answer = minusNumber - editText.text.toString().toDouble()
            }
            editText.text = answer.toString()
            Log.d("answer", answer.toString())
        }
        else if (timesBool) {
            val btnSelected = view as Button
            when(btnSelected.id) {
                btnEqual.id -> answer = timesNumber * editText.text.toString().toDouble()
            }
            editText.text = answer.toString()
            Log.d("answer", answer.toString())
        }
        else if (devideBool) {
            val btnSelected = view as Button
            when(btnSelected.id) {
                btnEqual.id -> answer = devideNumber / editText.text.toString().toDouble()
            }
            editText.text = answer.toString()
            Log.d("answer", answer.toString())
        }
    }
}