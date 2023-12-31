package com.example.app

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.example.app.chart.ChartActivity
import com.example.app.indexBar.IndexBarActivity
import com.example.app.inputFilter.InputFilterActivity
import com.example.app.popup.PopupWindowActivity
import com.example.app.suffix.SuffixActivity

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //输入过滤器
        findViewById<Button>(R.id.inputFilter).setOnClickListener {
            startActivity(Intent(this, InputFilterActivity::class.java))
        }

        //图表
        findViewById<Button>(R.id.chart).setOnClickListener {
            startActivity(Intent(this, ChartActivity::class.java))
        }

        //带后缀文本
        findViewById<Button>(R.id.suffix).setOnClickListener {
            startActivity(Intent(this, SuffixActivity::class.java))
        }

        //带后缀文本
        findViewById<Button>(R.id.popup).setOnClickListener {
            startActivity(Intent(this, PopupWindowActivity::class.java))
        }

        //侧边索引条
        findViewById<Button>(R.id.indexBar).setOnClickListener {
            startActivity(Intent(this, IndexBarActivity::class.java))
        }
    }
}