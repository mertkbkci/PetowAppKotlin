package com.camerba.petowappkotlin.utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class HomePagerAdapter(fm:FragmentManager): FragmentPagerAdapter(fm) {
    private var mFragmentList:ArrayList<Fragment> = ArrayList()
   //fragment pager adaptörün yazmayı zorunlu kıldığı fonksiyon
    override fun getItem(position: Int): Fragment {
       return mFragmentList.get(position)
    }
    //fragment pager adaptörün yazmayı zorunlu kıldığı fonksiyon
    override fun getCount(): Int {
        return mFragmentList.size

    }
    //kişisel fonksiyon
    fun addFragment(fragment: Fragment){
        mFragmentList.add(fragment)
    }
}