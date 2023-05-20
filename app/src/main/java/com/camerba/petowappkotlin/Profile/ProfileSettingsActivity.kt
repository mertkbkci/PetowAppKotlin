package com.camerba.petowappkotlin.Profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.camerba.petowappkotlin.R
import com.camerba.petowappkotlin.utils.ListHelper
import io.ak1.BubbleTabBar

class ProfileSettingsActivity : AppCompatActivity() {
    private val ACTIVITY_NO=2
    private val TAG="ProfileActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_settings)
        setupNavigationView()
        setupToolbar()
        fragmentNavigations()
    }

    private fun fragmentNavigations() {
        tvProfiliDuzenleHesapAyarlari.setOnClickListener {
         profileSettingRoot.visibility=View.GONE
         var transaction=supportFragmentManager.beginTransaction()
            transaction.replace(R.id.profileSettingContainer, ProfileEditFragment())
            transaction.addToBackStack("EditProfileFragmentEklendi")
            transaction.commit()
        }
        tvCikisYap.setOnClickListener{
            profileSettingRoot.visibility=View.GONE
            var transaction=supportFragmentManager.beginTransaction()
            transaction.replace(R.id.profileSettingContainer, SignOutFragment())
            transaction.addToBackStack("SignOutFragmentEklendi")
            transaction.commit()

        }
    }

    private fun setupToolbar() {
        imgBack.setOnClickListener{
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        profileSettingRoot.visibility=View.VISIBLE
        super.onBackPressed()
    }

    fun setupNavigationView(){

        ListHelper.setupNavigationView(context = this, bubbleTabBar = BubbleTabBar(this))
        var menu= BubbleTabBar.menu
        var menuItem=menu.getItem(ACTIVITY_NO)
        menuItem.setChecked(true)
    }

}