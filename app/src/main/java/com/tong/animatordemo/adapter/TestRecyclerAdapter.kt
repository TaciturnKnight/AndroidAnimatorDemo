package com.tong.animatordemo.adapter

import android.content.Context
import android.view.View
import android.widget.ImageView
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
        lateinit var title: TextView
        lateinit var desc: TextView
        lateinit var pic: ImageView

        init {
            title = view.findViewById(R.id.item_title)
            desc = view.findViewById(R.id.item_desc)
            pic = view.findViewById(R.id.item_pic)
        }

        override fun setData(data: ItemBean, position: Int) {
            title.setText(data.title)
            desc.setText(data.desc)
            pic.setImageResource(R.mipmap.ic_launcher)
        }

    }
}