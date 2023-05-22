package com.camerba.petowappkotlin.Profile

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.camerba.petowappkotlin.R
import com.camerba.petowappkotlin.utils.ListHelper
import com.camerba.petowappkotlin.utils.UniversalImageLoader
import io.ak1.BubbleTabBar


class ProfileActivity : AppCompatActivity() {
    private val ACTIVITY_NO=2
    private val TAG="ProfileActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        setupProfilePhoto()
        setupToolbar()
        setupNavigationView()
    }

    private fun setupProfilePhoto() {
        val imgURL:"i.hizliresim.com/62qkwvy.jfif"
        UniversalImageLoader.setImage(imgURL,"circleProfileImage","progressBar","https://",)
    }

    private fun setupToolbar() {
        imgProfileSettings.setOnClickListener{
         var intent=Intent(this,ProfileSettingsActivity::class.java)
         startActivity(intent)
     }
        val tvProfilDuzenleButon = findViewById<Button>(R.id.tvProfilDuzenleButon)
        tvProfilDuzenleButon.setOnClickListener {
            profilRoot.visibility = View.GONE
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.profileContainer, ProfileEditFragment())
            transaction.addToBackStack("editProfileFragmentEklendi")
            transaction.commit()
        }


    }

    fun setupNavigationView(){

        ListHelper.setupNavigationView(context = this, bubbleTabBar = BubbleTabBar(this))
        var menu=BubbleTabBar.menu
        var menuItem=menu.getItem(ACTIVITY_NO)
        menuItem.setChecked(true)
    }

    override fun onBackPressed() {
        findViewById(id.profileRoot).visibility=View.VISIBLE
        super.onBackPressed()
    }
}