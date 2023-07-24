package com.example.FunctionTestProject

import android.content.Context

open class FuTestClass constructor(context: Context) {

    open fun returnString(): String {
        return "父类"
    }
}