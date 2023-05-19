package com.camerba.petowappkotlin.utils


import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx

class BottomnavigationViewHelper {

    companion object {

        fun setupBottomNavigationView(bottomNavigationViewEx: BottomNavigationViewEx){
            bottomNavigationViewEx.enableAnimation(false)
            bottomNavigationViewEx.enableItemShiftingMode(false)
            bottomNavigationViewEx.enableShiftingMode(false)
        }

    }
}
