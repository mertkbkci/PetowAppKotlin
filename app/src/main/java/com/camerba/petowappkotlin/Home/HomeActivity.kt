package com.camerba.petowappkotlin.Home

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.camerba.petowappkotlin.R
import com.camerba.petowappkotlin.utils.HomePagerAdapter
import com.camerba.petowappkotlin.utils.ListHelper
import io.ak1.BubbleTabBar


class HomeActivity : AppCompatActivity() {
    private val ACTIVITY_NO=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setupNavigationView()
        setupHomeViewPager()
    }

    fun setupNavigationView(){

        ListHelper.setupNavigationView(context = this, bubbleTabBar = BubbleTabBar(this))
        var menu=BubbleTabBar.menu
        var menuItem=menu.getItem(ACTIVITY_NO)
        menuItem.setChecked(true)


}

    private fun setupHomeViewPager() {
      var homePagerAdapter=HomePagerAdapter(supportFragmentManager)
        homePagerAdapter.addFragment(CameraFragment())//id=0
        homePagerAdapter.addFragment(HomeFragment()) //id=1
        homePagerAdapter.addFragment(MessagesFragment()) //id=2

        //activity mainde bulunan viewpagera oluşturduğumuz adaptörü atadık
        homeViewPager.adapter=homePagerAdapter
       //viewpagerın home fragmenti ile başlamasını sağladık
        homeViewPager.setCurrentItem()
    }
}