package com.camerba.petowappkotlin.login

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.camerba.petowappkotlin.R
import com.camerba.petowappkotlin.utils.EventbusDataEvents
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class EmailGirisYontemiFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        return inflater.inflate(R.layout.fragment_email_giris_yontemi, container, false)
    }

    @Subscribe(sticky = true)
    internal fun onTelefonNoEvent(emailAdres : EventbusDataEvents.EmailGonder   ){
        var gelenEmail=emailAdres.email

    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        EventBus.getDefault().register(this)

    }

    override fun onDetach() {
        super.onDetach()
        EventBus.getDefault().unregister(this)
    }


}