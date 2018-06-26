package com.tong.animatordemo.utils

import android.content.Context
import com.tong.animatordemo.config.AnimatorConstants

/**
 * Created by tong on 2018/6/26 下午6:30
 */
class ScreenUtil {
    companion object {
        fun getScreenWid(context: Context): Int {
            return context.resources.displayMetrics.widthPixels
        }

        fun getScreenHeight(context: Context): Int {
            return context.resources.displayMetrics.heightPixels
        }
    }
}