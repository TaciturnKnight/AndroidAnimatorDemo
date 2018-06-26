package com.tong.animatordemo.base

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by tong on 2018/6/26 上午10:07
 */
abstract class BaseActivity : AppCompatActivity() {
    lateinit var mContext: Context
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mContext = this@BaseActivity
        preSetContentView()
        setContentView(getLayout())
        initView()
        initListener()
        initData()
    }

    abstract fun preSetContentView()
    abstract fun initView()
    abstract fun initListener()
    abstract fun initData()
    abstract fun getLayout(): Int
}