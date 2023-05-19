package com.camerba.petowappkotlin.utils



import android.content.Context
import android.content.Intent
import com.camerba.petowappkotlin.R
import io.ak1.BubbleTabBar
import io.ak1.OnBubbleClickListener


class ListHelper {

    companion object {
        fun setupNavigation(context: Context, bubbleTabBar: BubbleTabBar) {

            bubbleTabBar.addBubbleListener(object : OnBubbleClickListener {
                override fun onBubbleClick(id: Int) {
               when(id.toInt){

                   R.id.ic_home ->{

                       val intent:Intent(context, HomeActivity::class.java)
                       context.startActivity(intent)
                       return true
                   }
                   R.id.ic_search ->{

                       val intent:Intent(context, HomeActivity::class.java)
                       context.startActivity(intent)
                       return true
                   }
                   R.id.ic_profile ->{

                       val intent:Intent(context, HomeActivity::class.java)
                       context.startActivity(intent)
                       return true
                   }

               }

                }
            })


        }
    }
}

