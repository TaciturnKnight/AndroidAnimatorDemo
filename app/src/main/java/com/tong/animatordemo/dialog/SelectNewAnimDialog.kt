package com.tong.animatordemo.dialog

import android.app.Dialog
import android.content.Context
import android.view.View
import com.tong.animatordemo.R
import com.tong.animatordemo.interf.OnSelectNewAnimListener
import kotlinx.android.synthetic.main.dialog_selectnewanim.*

/**
 * Created by tong on 2018/7/2 下午2:09
 */
class SelectNewAnimDialog(mContext: Context, listener: OnSelectNewAnimListener) : Dialog(mContext, R.style.DialogStyle), View.OnClickListener {

    var mContext: Context = mContext;
    var listener: OnSelectNewAnimListener = listener

    init {
        setContentView(R.layout.dialog_selectnewanim)
        initView()
    }

    private fun initView() {
        select_explode.setOnClickListener(this)
        select_slide.setOnClickListener(this)
        select_fade.setOnClickListener(this)
        select_share.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.select_explode ->
                listener.onSelectExplode()
            R.id.select_slide ->
                listener.onSelectSlide()
            R.id.select_fade ->
                listener.onSelectFade()
            R.id.select_share ->
                listener.onSelectShare()
        }
    }
}