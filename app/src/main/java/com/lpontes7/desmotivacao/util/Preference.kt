package com.lpontes7.desmotivacao.util

import android.content.Context
import android.content.SharedPreferences

class Preferences(context: Context) {

    private val mSharedPrefences: SharedPreferences = context.getSharedPreferences("desmotivacao", Context.MODE_PRIVATE)

    fun storeString(key: String, value: String) {
        mSharedPrefences.edit().putString(key, value).apply()
    }

    fun getStoredString(key: String): String? {
        return mSharedPrefences.getString(key, "")
    }
}