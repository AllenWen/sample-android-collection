package com.example.app.chart

import android.app.Activity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.app.R

class ChartActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chart)

        //走势图
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            findViewById<LineChartView>(R.id.lineChartView).addLines(
                arrayListOf(
                    Pair(
                        android.R.color.holo_blue_bright,
                        arrayListOf(0.1, 0.2, 0.3, 0.2, 0.5, 0.4)
                    ),
                    Pair(
                        android.R.color.holo_orange_light,
                        arrayListOf(0.0, 0.6, 0.3, 0.8, 0.2, 0.1)
                    )
                )
            )
        }, 200)

    }
}