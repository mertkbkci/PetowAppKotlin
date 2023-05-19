package com.camerba.petowappkotlin.utils



import android.content.Context
import io.ak1.BubbleTabBar
import io.ak1.OnBubbleClickListener


class ListHelper {

    companion object {
        fun setupNavigation(context: Context, bubbleTabBar: BubbleTabBar) {

            bubbleTabBar.addBubbleListener(object : OnBubbleClickListener {
                override fun onBubbleClick(id: Int) {


                }
            })


        }
    }
}

