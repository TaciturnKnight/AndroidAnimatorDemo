package com.tong.animatordemo.act.detail

import android.transition.Explode
import com.tong.animatordemo.R
import com.tong.animatordemo.base.BaseActivity

/**
 * Created by tong on 2018/6/26 下午4:08
 */
class ExplodeActivity : BaseActivity() {

    override fun preSetContentView() {
        window.enterTransition = Explode()
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