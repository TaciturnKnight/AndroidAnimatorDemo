package com.tong.animatordemo.act

import android.widget.ImageView
import android.widget.TextView
import com.tong.animatordemo.R
import com.tong.animatordemo.base.BaseActivity

/**
 * Created by tong on 2018/6/26 上午10:48
 */
class SimpleAnimActivity : BaseActivity() {
    lateinit var title: TextView
    lateinit var pic: ImageView
    var string:String ="MIIEpQIBAAKCAQEA1UJLZZRuPhdXmKa2rY/FgLA24i6nWANlsADT47DcCRXdHUzwgJehMRERQL9oPxXlyz+7AfwOUDvKQ8993ujq99ztEQptctuHRdgsuDRPUrAADaCUFWEX1muvLx2nF5d/klT+pbl1iYUTvWku/lK2JxCFYIMBUg5Ae7zy2+3PzwiMAXuOBlR0EDkR3qll1vVNd3/4S6wgM01ovmDvT2w0N23dL2OSLqUvx0RLV3ahJtkpt9SNzZENPo1PqZaMpJ43nnPqOd9PL+89Edx3bjvSsam2DV71BrY528IcPN3cXuoOInz5vDmlOuApzBSDm01VkdrbMR/qvJoqoVxKvBYq3QIDAQABAoIBAQClaWtz2eJ8lLxj8gPFsbt+qq+XVpqEQPZRwwKXHCo/fc7pGDF/fJ0Rouxf7Vcdf42izcburiQoBYhIeptmGAGQybKzwgPM0Awnl5pwMlrIhy0zZLcXshy8OwBBql1dhiv0Q6rUvno1dZwvEXPa3irdOApMJrEShW1szM0O23GRYeRFk1WQ0RIQDVTVYTJKR3ejBidJOxH/L7XM6hBZslOu9HRUx37NdJdhQPzPPAGMIoiTqyj7sQEDMQHn5l5pxb81wQ20/cS77O8vXTGmiY0hCuT41I9Mzn/OUGW105gzpFadZM8LxquHUZiFdvSzmh4QXzm8IzpE6qR6gJavY8tdAoGBAOrbQ/l8pKU4RUPsZY9d4SR1TpVM+aiZoXEFBVbFX3ajHXDpyiRanT3QevvdFE8drnxRZ5BRdNcLO3iPZEFDtK70VhBLl1MQudpzOJY8mQKqy/zrXRRl91HPX9cEuQgyUTz4ElecVBCAt40H+6J27cmqQDIyV2c5vsqBRG6h5c2XAoGBAOh1RU7T0J5n3zuLGvtI0ayN1HLv8Ifqe4KpbeaXBPPsJzDikLlE7aXCMABQg857bODZDb/NrMeKketITjuvdFV3C1DttGX44BvBV41vUnfm9Q91Pw9zo25ymwbvzxBcA53GDhZ155vmDXqKVfTYdHfX7OECi6APYTALhTkGAcGrAoGAEeV3fpFy8mwhSxW+f3hF6cNOo63j8GcUmEorp/sOVToEyk/maXLGPKmgVYT5QTYfz7VcUPEEGEbw1zUGDLseD57q1/8KnvfNUcop67jeaAef17wPsbg7am6E/RuNBgTfj+fPbgGpnkBQvFx5Xl31rMJedfTEGEecNE45arzHiC0CgYEA2oEZI+6gg7W5tTudoiShyqQK1ftKSkgTzw852e2M30fU0vO0/CGZjR0Kh9EnBFkqT/RXIzrOtUZAwTvXJe1X2dorjefSkaOt7QkBJlZE26YCJoScQQb+0Zvys0OJjKQhVhXMOjqb+gP2GYCdKaipWdlitWLyIgMy5Ll/gclurz8CgYEA5U989fEiw7nKb6krqs4rHdd8eg5g+rWoRw/oWKKy0+6UiPxtnZSzIHtX4/+I3ftiUF9X3Xl5kmU2B1SnxiQN/LT8mpi5q86bgMSQjf664hXGRWuFoxxLCNM7ISzuLNcW2+L9iPYMN0A9flDulwnBrmm2io2LD1clf5g7kG6Iin0="
    override fun initView() {
        title = findViewById(R.id.detail_title)
        pic = findViewById(R.id.detail_pic)
    }

    override fun initListener() {
        pic.setOnClickListener({
            finish()
        })
    }

    override fun initData() {

    }

    override fun getLayout(): Int {
        return R.layout.activity_simpleanim
    }

    override fun finish() {
        super.finish()
        //in 代表进入动画，也就是自己finish后 要显示的activity要执行的动画
        //out 代表移出动画，也就是自己finish时要执行的动画
        overridePendingTransition(R.anim.finish_activity_in, R.anim.finish_activity_out)
    }
}