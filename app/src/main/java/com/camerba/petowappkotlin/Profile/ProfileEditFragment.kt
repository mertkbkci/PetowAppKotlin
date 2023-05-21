package com.camerba.petowappkotlin.Profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.camerba.petowappkotlin.R
import com.camerba.petowappkotlin.utils.UniversalImageLoader
import com.nostra13.universalimageloader.core.ImageLoader


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class ProfileEditFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

       val view=inflater.inflate(R.layout.fragment_profile_edit, container, false)

        setupProfilePicture()



        view.imgClose.setOnClickListener{

            activity.onBackPressed()
        }

        return view


    }

    private fun initImageLoader(){

        var universalImageLoader=UniversalImageLoader(activity)
        ImageLoader.getInstance().init(universalImageLoader.config)

    }

    private fun setupProfilePicture(){

        //https://www.hizliresim.com/62qkwvy
        var imgURL="www.hizliresim.com/62qkwvy"
        UniversalImageLoader.setImage(imgURL, circleProfileImage,null,"https://")
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ProfileEditFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}