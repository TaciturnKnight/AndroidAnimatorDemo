package com.tong.animatordemo.act

import android.app.ActivityOptions
import android.content.Intent
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Pair
import android.view.View
import com.tong.animatordemo.R
import com.tong.animatordemo.act.detail.ExplodeActivity
import com.tong.animatordemo.adapter.TestRecyclerAdapter
import com.tong.animatordemo.base.BaseActivity
import com.tong.animatordemo.base.OnItemClickListener
import com.tong.animatordemo.bean.ItemBean

/**
 * Created by tong on 2018/7/2 下午2:53
 */
class ListDataActivity : BaseActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: TestRecyclerAdapter
    override fun preSetContentView() {

    }

    override fun initView() {
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.layoutManager = LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false)
        adapter = TestRecyclerAdapter(mContext, object : OnItemClickListener {
            override fun onItemClick(position: Int) {
                var intent: Intent = Intent(mContext, ExplodeActivity::class.java)
                var view: View = recyclerView.getChildAt(position)
                var holder: TestRecyclerAdapter.Holder = recyclerView.getChildViewHolder(view) as TestRecyclerAdapter.Holder
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this@ListDataActivity,
                        Pair.create(holder.pic, "newanim")).toBundle())
            }

        })
        recyclerView.adapter = adapter
        var datas: List<ItemBean> = ArrayList()
        var i: Int = 0

    }

    override fun initListener() {
    }

    override fun initData() {
    }

    override fun getLayout(): Int {
        return R.layout.activity_listdata
    }

}