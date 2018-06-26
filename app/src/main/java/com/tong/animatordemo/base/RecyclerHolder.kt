package com.tong.animatordemo.base

import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by tong on 2018/6/25 下午8:39
 */
abstract class RecyclerHolder<Data>(itemView: View?, itemListener: OnItemClickListener) : RecyclerView.ViewHolder(itemView) {
    abstract fun setData(data: Data, position: Int)
}