package com.tong.animatordemo.dialog

import android.app.Dialog
import android.content.Context
import android.view.Gravity
import android.view.View
import android.view.WindowManager
import android.widget.TextView
import com.tong.animatordemo.R
import com.tong.animatordemo.interf.OnSelectAnimListener
import com.tong.animatordemo.utils.ScreenUtil
import kotlinx.android.synthetic.main.dialog_selectanim.*

/**
 * Created by tong on 2018/6/26 下午6:25
 */
class SelectAnimDialog(mContext: Context, selectListener: OnSelectAnimListener) : Dialog(mContext, R.style.DialogStyle), View.OnClickListener {
    lateinit var mContext: Context
    lateinit var selectListener: OnSelectAnimListener

    init {
        this.mContext = mContext
        this.selectListener = selectListener
        setContentView(R.layout.dialog_selectanim)
        window.setGravity(Gravity.CENTER)
        var params: WindowManager.LayoutParams = window.attributes
        params.width = ScreenUtil.getScreenWid(mContext) * 6 / 10
        params.height = WindowManager.LayoutParams.WRAP_CONTENT
        window.attributes = params
        initView()
    }

    fun initView() {
        translucentx.setOnClickListener(this)
        translucenty.setOnClickListener(this)
        translucent_bevel.setOnClickListener(this)
        scale.setOnClickListener(this)
        fade.setOnClickListener(this)
        rote.setOnClickListener(this)
        group.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.translucentx -> {
                selectListener.onSelectTranslucentX()
            }
            R.id.translucenty -> {
                selectListener.onSelectTranslucentY()
            }
            R.id.translucent_bevel -> {
                selectListener.onSelectTranslucentBevel()
            }
            R.id.scale -> {
                selectListener.onSelectTranslucentScale()
            }
            R.id.fade -> {
                selectListener.onSelectFade()
            }
            R.id.rote -> {
                selectListener.onSelectRote()
            }
            R.id.group -> {
                selectListener.onSelectGroup()
            }
        }
        dismiss()
    }
}