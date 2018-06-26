package com.tong.animatordemo.act

import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.annotation.SuppressLint
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.TextView
import com.tong.animatordemo.R

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.rotatetv -> {

            }
            R.id.radio -> {

            }
        }
    }

    lateinit var textView: TextView
    @SuppressLint("ObjectAnimatorBinding")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.rotatetv)

        textView.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        })
        textView.setOnClickListener { view ->
            var path: Path = Path()
            path.moveTo(100f, 200f)
            path.quadTo(300f, 300f, 291f, 123f)
            var canvas: Canvas = Canvas()
            var paint: Paint = Paint()
            paint.strokeWidth = 10f
            paint.color = ContextCompat.getColor(this@MainActivity, android.R.color.black)
            canvas.drawPath(path, paint)
            var tvAnimator: ObjectAnimator = ObjectAnimator.ofFloat(textView, View.X, View.Y, path)
            tvAnimator.addUpdateListener({ animation ->
                var values: Array<PropertyValuesHolder> = animation.values
                var xHolder: PropertyValuesHolder = values[0]
                var yHolder: PropertyValuesHolder = values[1]
                var x: Float = animation.getAnimatedValue(xHolder.propertyName) as Float
                var y: Float = animation.getAnimatedValue(yHolder.propertyName) as Float
                textView.setText(x.toString() + "," + y.toString())
            })
            tvAnimator.setDuration(5000)
            tvAnimator.start()
        }
    }

}
