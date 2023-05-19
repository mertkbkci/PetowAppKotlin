package com.camerba.petowappkotlin.utils


import android.content.Context
import android.content.Intent
import android.view.MenuItem
import com.camerba.petowappkotlin.R
import com.google.android.material.bottomnavigation.BottomNavigationView


class BottomnavigationViewHelper {

    companion object{


       fun setupNavigation(context: Context, ){

           {

              when(item.itemId){

                  R.id.ic_home ->{
                     val intent:Intent(context,HomeActivity::class.java)
                      context.startActivity(intent)
                     return true
                  }
                  R.id.ic_search ->{
                      val intent:Intent(context,SearchActivity::class.java)
                      context.startActivity(intent)
                     return true
                  }
                  R.id.ic_profile ->{
                      val intent:Intent(context,PofileActivity::class.java)
                      context.startActivity(intent)
                    return true
                  }
              }
                    return false
               }


           }
       }
    }
}
