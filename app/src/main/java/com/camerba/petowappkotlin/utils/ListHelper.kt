package com.camerba.petowappkotlin.utils



import android.content.Context
import android.content.Intent
import androidx.viewpager.widget.ViewPager
import com.camerba.petowappkotlin.R
import io.ak1.BubbleTabBar
import io.ak1.OnBubbleClickListener


class ListHelper {

    companion object {
        fun setupNavigation(context: Context, bubbleTabBar: BubbleTabBar) {

            bubbleTabBar.addBubbleListener(object : OnBubbleClickListener {
                override fun onBubbleClick(id: Int) {
               when(id.and(Int)){

                   R.id.ic_home ->{

                       val intent:Intent(context, HomeActivity::class.java).addFlags(Intent.FLAG.ACTİVİTY_NO_ANİMATİON)
                       context.startActivity(intent)
                       return true
                   }
                   R.id.ic_search ->{

                       val intent:Intent(context, SearchActivity::class.java).addFlags(Intent.FLAG.ACTİVİTY_NO_ANİMATİON)
                       context.startActivity(intent)
                       return true
                   }
                   R.id.ic_profile ->{

                       val intent:Intent(context, ProfileActivity::class.java).addFlags(Intent.FLAG.ACTİVİTY_NO_ANİMATİON)
                       context.startActivity(intent)
                       return true
                   }

               }

                }
            })


        }
        fun BubbleTabBar.setupViewPager(viewPager: ViewPager) {
            viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
                override fun onPageScrolled(
                    position: Int,
                    positionOffset: Float,
                    positionOffsetPixels: Int
                ) {

                }

                override fun onPageSelected(position: Int) {

                }

                override fun onPageScrollStateChanged(state: Int) {

                }
            }
}

