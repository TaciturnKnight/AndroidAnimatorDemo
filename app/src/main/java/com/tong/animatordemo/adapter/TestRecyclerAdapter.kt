package com.tong.animatordemo.adapter

import android.content.Context
import android.view.View
import android.widget.TextView
import com.tong.animatordemo.R
import com.tong.animatordemo.base.OnItemClickListener
import com.tong.animatordemo.base.RecyclerBaseAdapter
import com.tong.animatordemo.base.RecyclerHolder
import com.tong.animatordemo.bean.ItemBean

/**
 * Created by tong on 2018/6/25 下午9:09
 */
class TestRecyclerAdapter(mContext: Context, itemListener: OnItemClickListener) : RecyclerBaseAdapter<ItemBean>(mContext, itemListener) {
    override fun getHolder(itemview: View, listener: OnItemClickListener): RecyclerHolder<ItemBean> {
        return Holder(itemview, listener)
    }

    override fun getLayout(): Int {
        return R.layout.activity_main
    }

    inner class Holder(view: View, listener: OnItemClickListener) : RecyclerHolder<ItemBean>(view, listener) {
        lateinit var textview: TextView

        init {
            textview = view.findViewById(R.id.radio)
        }

        override fun setData(data: ItemBean, position: Int) {
            textview.setText(data.name)
        }

    }
}