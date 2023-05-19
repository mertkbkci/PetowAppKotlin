package com.camerba.petowappkotlin.Home

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.camerba.petowappkotlin.R
import com.camerba.petowappkotlin.utils.ListHelper
import io.ak1.BubbleTabBar


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

setupNavigation()
    }

fun setupNavigation(){

    ListHelper.setupNavigation(this , bubbleTabBar)
}


}