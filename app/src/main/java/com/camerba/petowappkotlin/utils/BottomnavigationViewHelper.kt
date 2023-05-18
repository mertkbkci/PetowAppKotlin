package com.camerba.petowappkotlin.utils

import android.content.Context
import android.content.Intent
import android.view.MenuItem
import com.camerba.petowappkotlin.Home.HomeActivity
import com.camerba.petowappkotlin.Profile.ProfileActivity
import com.camerba.petowappkotlin.R
import com.camerba.petowappkotlin.Search.SearchActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomnavigationViewHelper {

    companion object{
        fun setupBottomNavigation(bottomNavigationView: BottomNavigationView){

        }
    }

    fun setupNavigation(context: Context,bottomNavigationView: BottomNavigationView){
        bottomNavigationView.setOnNavigationItemSelectedListener = object : BottomNavigationView.OnNavigationItemSelectedListener{
            override fun onNavigationItemSelected(item: MenuItem): Boolean
            {
                when(item.itemId)
                {

                  R.id.ic_home ->
                  {
                     val intent = Intent(context,HomeActivity::class.java)
                      context.startActivity(intent)
                      return true
                  }
                    R.id.ic_search ->
                    {
                        val intent = Intent(context,SearchActivity::class.java)
                        context.startActivity(intent)
                        return true
                    }
                  R.id.ic_profile ->
                  {
                      val intent = Intent(context,ProfileActivity::class.java)
                      context.startActivity(intent)
                      return true
                  }

                }

            }


        }



    }

}