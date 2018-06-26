package com.tong.animatordemo.act

import android.content.Context
import android.content.Intent

/**
 * Created by tong on 2018/6/26 上午11:13
 */
class TestClass {
    fun start(context: Context) {
        val intent = Intent(context, SimpleAnimActivity::class.java)
        context.startActivity(intent)
    }
}
