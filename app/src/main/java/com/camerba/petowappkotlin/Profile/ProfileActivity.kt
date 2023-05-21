package com.camerba.petowappkotlin.Profile

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.camerba.petowappkotlin.R
import com.camerba.petowappkotlin.utils.ListHelper
import io.ak1.BubbleTabBar


class ProfileActivity : AppCompatActivity() {
    private val ACTIVITY_NO=2
    private val TAG="ProfileActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        setupToolbar()
        setupNavigationView()
    }

    private fun setupToolbar() {
     imgProfileSettings.setOnClickListener{
         var intent=Intent(this,ProfileSettingsActivity::class.java)
         startActivity(intent)
     }

        tvProfilDuzenleButon.setOnClickListener {
            profileRoot.visibility=View.GONE
            var transaction=supportFragmentManager.beginTransaction()
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
        profileRoot.visibility=View.VISIBLE
        super.onBackPressed()
    }
}