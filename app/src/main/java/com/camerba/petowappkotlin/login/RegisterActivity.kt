package com.camerba.petowappkotlin.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.camerba.petowappkotlin.R

class RegisterActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        init()

    }
    private fun init(){
        tvEposta.setOnClickListener {

            viewTelefon.visibility=View.GONE
            viewEposta.visibility=View.VISIBLE

        }
    }

}