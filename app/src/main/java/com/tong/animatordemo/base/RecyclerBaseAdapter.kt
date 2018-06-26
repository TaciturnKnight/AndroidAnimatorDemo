package com.tong.animatordemo.base

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by tong on 2018/6/25 下午8:37
 */
abstract class RecyclerBaseAdapter<Data>(mContext: Context, itemListener: OnItemClickListener) : RecyclerView.Adapter<RecyclerHolder<Data>>() {
    lateinit var mContext: Context
    lateinit var itemListener: OnItemClickListener
    lateinit var datas: Array<Data>
    lateinit var inflater: LayoutInflater

    init {
        this.mContext = mContext
        this.itemListener = itemListener
        this.inflater = LayoutInflater.from(mContext)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerHolder<Data> {
        var view: View = inflater.inflate(getLayout(), null)
        view.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        return getHolder(view, itemListener)
    }

    override fun getItemCount(): Int {
        var count: Int = this.datas.size ?: 0
        return count
    }

    override fun onBindViewHolder(holder: RecyclerHolder<Data>, position: Int) {
        var bean: Data = datas.get(position)
        holder.setData(bean, position)
    }

    abstract fun getHolder(itemview: View, listener: OnItemClickListener): RecyclerHolder<Data>
    abstract fun getLayout(): Int
}