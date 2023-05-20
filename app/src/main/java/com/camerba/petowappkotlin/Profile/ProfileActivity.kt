package com.camerba.petowappkotlin.Profile

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.camerba.petowappkotlin.R
import com.camerba.petowappkotlin.utils.ListHelper
import io.ak1.BubbleTabBar


class ProfileActivity : AppCompatActivity() {
    private val ACTIVITY_NO=2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

      //  setupNavigationView()
    }

    fun setupNavigationView(){

        ListHelper.setupNavigationView(context = this, bubbleTabBar = BubbleTabBar(this))
        var menu=BubbleTabBar.menu
        var menuItem=menu.getItem(ACTIVITY_NO)
        menuItem.setChecked(true)
    }


}