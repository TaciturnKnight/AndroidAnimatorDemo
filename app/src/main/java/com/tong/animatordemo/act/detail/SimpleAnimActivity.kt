package com.tong.animatordemo.act.detail

import android.content.Intent
import android.widget.ImageView
import android.widget.TextView
import com.tong.animatordemo.R
import com.tong.animatordemo.base.BaseActivity
import com.tong.animatordemo.config.AnimatorConstants

/**
 * Created by tong on 2018/6/26 上午10:48
 */
class SimpleAnimActivity : BaseActivity() {
    lateinit var title: TextView
    lateinit var pic: ImageView
    lateinit var animType: String
    override fun preSetContentView() {

    }


    override fun initView() {
        title = findViewById(R.id.detail_title)
        pic = findViewById(R.id.detail_pic)
    }

    override fun initListener() {
        pic.setOnClickListener {
            finish()
        }
    }

    override fun initData() {
        var intent: Intent = getIntent()
        animType = intent.getStringExtra(AnimatorConstants.INTENT_TAG)
    }

    override fun getLayout(): Int {
        return R.layout.activity_simpleanim
    }

    override fun finish() {
        super.finish()
        when (animType) {
            AnimatorConstants.TRANSLATE_X ->
                overridePendingTransition(R.anim.finish_activity_translatex_in, R.anim.finish_activity_translatex_out)
            AnimatorConstants.TRANSLATE_Y ->
                overridePendingTransition(R.anim.finish_activity_translatey_in, R.anim.finish_activity_translatey_out)
            AnimatorConstants.TRANSLATE_BEVEL ->
                overridePendingTransition(R.anim.finish_activity_bevel_in, R.anim.finish_activity_bevel_out)
            AnimatorConstants.SCALE ->
                overridePendingTransition(R.anim.finish_activity_scale_in, R.anim.finish_activity_scale_out)
            AnimatorConstants.FADE -> {
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            }
            AnimatorConstants.ROTE -> {
                overridePendingTransition(R.anim.finish_activity_rote_in, R.anim.finish_activity_rote_out)
            }
            AnimatorConstants.GROUP -> {
                overridePendingTransition(R.anim.finish_activity_group_in, R.anim.finish_activity_group_out)
            }
        }
    }
}