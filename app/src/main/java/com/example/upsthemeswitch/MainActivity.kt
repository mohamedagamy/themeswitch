package com.example.upsthemeswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import com.example.upsthemeswitch.Utils.currentPosition
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Utils.onActivityCreateSetTheme(this@MainActivity)
        setContentView(R.layout.activity_main)
        initView()
    }


    private fun initView() {

        spinner.setSelection(currentPosition)
        currentPosition = spinner.selectedItemPosition
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if(currentPosition != position)
                    Utils.changeToTheme(this@MainActivity,position)

                currentPosition = position

            }

        }
    }
}
