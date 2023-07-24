package com.example.FunctionTestProject

import android.content.Context

class ZiTestClass constructor(context: Context): FuTestClass(context) {

    override fun returnString(): String {
        super.returnString()
        return "子类"
    }
}