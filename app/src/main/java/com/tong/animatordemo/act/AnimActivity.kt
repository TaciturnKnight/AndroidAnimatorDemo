package com.tong.animatordemo.act

import android.app.ActivityOptions
import android.content.Intent
import android.view.View
import android.widget.Button
import com.tong.animatordemo.R
import com.tong.animatordemo.act.detail.ExplodeActivity
import com.tong.animatordemo.act.detail.SimpleAnimActivity
import com.tong.animatordemo.base.BaseActivity
import com.tong.animatordemo.config.AnimatorConstants
import com.tong.animatordemo.dialog.SelectAnimDialog
import com.tong.animatordemo.interf.OnSelectAnimListener

/**
 * Created by tong on 2018/6/26 上午10:06
 */
class AnimActivity : BaseActivity(), View.OnClickListener {

    lateinit var simple: Button
    lateinit var explode: Button
    lateinit var selectAnimDialog: SelectAnimDialog

    override fun preSetContentView() {

    }

    override fun initView() {
        selectAnimDialog = SelectAnimDialog(mContext, object : OnSelectAnimListener {

            var intent: Intent = Intent(mContext, SimpleAnimActivity::class.java)

            override fun onSelectTranslucentX() {
                intent.putExtra(AnimatorConstants.INTENT_TAG, AnimatorConstants.TRANSLATE_X)
                startActivity(intent)
                overridePendingTransition(R.anim.start_activity_translatex_in, R.anim.start_activity_translatex_out)
            }

            override fun onSelectTranslucentY() {
                intent.putExtra(AnimatorConstants.INTENT_TAG, AnimatorConstants.TRANSLATE_Y)
                startActivity(intent)
                overridePendingTransition(R.anim.start_activity_translatey_in, R.anim.start_activity_translatey_out)
            }

            override fun onSelectTranslucentBevel() {
                intent.putExtra(AnimatorConstants.INTENT_TAG, AnimatorConstants.TRANSLATE_BEVEL)
                startActivity(intent)
                overridePendingTransition(R.anim.start_activity_bevel_in, R.anim.start_activity_bevel_out)
            }

            override fun onSelectTranslucentScale() {
                intent.putExtra(AnimatorConstants.INTENT_TAG, AnimatorConstants.SCALE)
                startActivity(intent)
                overridePendingTransition(R.anim.start_activity_scale_in, R.anim.start_activity_scale_out)
            }

            override fun onSelectFade() {
                intent.putExtra(AnimatorConstants.INTENT_TAG, AnimatorConstants.FADE)
                startActivity(intent)
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            }

            override fun onSelectRote() {
                intent.putExtra(AnimatorConstants.INTENT_TAG, AnimatorConstants.ROTE)
                startActivity(intent)
                overridePendingTransition(R.anim.start_activity_rote_in, R.anim.start_activity_rote_out)
            }

            override fun onSelectGroup() {
                intent.putExtra(AnimatorConstants.INTENT_TAG, AnimatorConstants.GROUP)
                startActivity(intent)
                overridePendingTransition(R.anim.start_activity_group_in, R.anim.start_activity_group_out)
            }
        })
    }

    override fun initListener() {
        simple.setOnClickListener(this)
        explode.setOnClickListener(this)
    }

    override fun initData() {

    }

    override fun getLayout(): Int {
        return R.layout.activity_anim
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.simple -> {
                selectAnimDialog.show()
            }
            R.id.explode -> {
                var intent: Intent = Intent(mContext, ExplodeActivity::class.java)
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this@AnimActivity).toBundle())
            }
        }
    }
}