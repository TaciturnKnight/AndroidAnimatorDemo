package com.tong.animatordemo.act.detail

import android.transition.Explode
import android.transition.Fade
import android.transition.Slide
import android.view.Window
import com.tong.animatordemo.R
import com.tong.animatordemo.base.BaseActivity
import com.tong.animatordemo.config.AnimatorConstants

/**
 * Created by tong on 2018/6/26 下午4:08
 */
class ExplodeActivity : BaseActivity() {
    lateinit var name: String
    override fun preSetContentView() {
        name = intent.getStringExtra(AnimatorConstants.INTENT_TAG)
        when (name) {
            AnimatorConstants.EXPLODE -> {
                window.enterTransition = Explode()
            }
            AnimatorConstants.SLIDE -> {
                window.enterTransition = Slide()
            }
            AnimatorConstants.FADE -> {
                window.enterTransition = Fade()
                window.exitTransition = Fade()
            }
            AnimatorConstants.SHARE -> {
                window.requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
            }
        }
    }

    override fun initView() {
    }

    override fun initListener() {
    }

    override fun initData() {
    }

    override fun getLayout(): Int {
        return R.layout.activity_simpleanim
    }

}