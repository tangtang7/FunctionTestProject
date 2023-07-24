package com.example.FunctionTestProject

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * kotlin 中，空值返回的 substring 和 字符串长度
     */
    fun test1() {
        val testVar: String? = null
        Log.e("whh","testVar = " + testVar + ", testVar?.substring = " + testVar?.substring(0) + ", testVar?.length = " + testVar?.length)
    }

    /**
     * kotlin 继承时，父类子类都有返回值时，返回为何值（为子类返回值）
     */
    fun test2() {
        val zi = ZiTestClass(applicationContext)
        Log.e("whh","zi.returnString = " + zi.returnString())
    }
}