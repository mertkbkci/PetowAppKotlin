package com.camerba.petowappkotlin.login

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.InputType
import android.text.TextWatcher
import android.view.View
import androidx.core.content.ContextCompat
import com.camerba.petowappkotlin.R

class RegisterActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        init()

    }
    private fun init(){
        tvEposta.setOnClickListener {

            viewTelefon.visibility=View.INVISIBLE
            viewEposta.visibility=View.VISIBLE
            etGirisYontemi.setText("")
            etGirisYontemi.inputType=InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS
            etGirisYontemi.setHint("E-Posta")

        }
        tvTelefon.setOnClickListener {
            viewEposta.visibility=View.INVISIBLE
            viewTelefon.visibility=View.VISIBLE
            etGirisYontemi.setText("")
            etGirisYontemi.inputType=InputType.TYPE_CLASS_NUMBER
            etGirisYontemi.setHint("Telefon")
        }
        etGirisYontemi.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (count >=10){
                    btnIleri.isEnable=true
                    btnIleri.setTextColor(ContextCompat.getColor(this@RegisterActivity,R.color.white))
                    btnIleri.setBackgroundColor(ContextCompat.getColor(this@RegisterActivity,R.color.mavi))

                }
            }



            override fun afterTextChanged(s: Editable?) {

            }
            })



    }
}