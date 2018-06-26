package com.tong.animatordemo.act

import android.content.Intent
import android.view.View
import android.widget.Button
import com.tong.animatordemo.R
import com.tong.animatordemo.base.BaseActivity

/**
 * Created by tong on 2018/6/26 上午10:06
 */
class AnimActivity : BaseActivity() {
    lateinit var simple: Button

    override fun initView() {
        simple = findViewById(R.id.simple)
    }

    override fun initListener() {
        simple.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                var intent: Intent = Intent(mContext, SimpleAnimActivity::class.java)
                startActivity(intent)
                //in 代表进入动画，也就是新启动的activity的动画
                //out 代表移出动画，也就是启动的同时，当前activity要执行的动画
                overridePendingTransition(R.anim.start_activity_in, R.anim.start_activity_out)
            }
        })
    }

    override fun initData() {

    }

    override fun getLayout(): Int {
        return R.layout.activity_anim
    }

}