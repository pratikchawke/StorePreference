package com.pratik.storepeference

import android.content.Context

class StorePreference  private constructor() {

    fun putString(key: String, value: String) {
        val sharedPreferences = sContext!!.getSharedPreferences(cacheContainer, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        editor.putString(key, value)
        editor.apply()
    }

    fun getString(key: String): String? {
        val sharedPreferences = sContext!!.getSharedPreferences(cacheContainer, Context.MODE_PRIVATE)

        return sharedPreferences.getString(key, null)
    }

    fun putBoolean(key: String, value: Boolean) {
        val sharedPreferences = sContext!!.getSharedPreferences(cacheContainer, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        editor.putBoolean(key, value)
        editor.apply()
    }

    fun getBoolean(key: String): Boolean {
        val sharedPreferences = sContext!!.getSharedPreferences(cacheContainer, Context.MODE_PRIVATE)

        return sharedPreferences.getBoolean(key, false)
    }

    fun putLong(key: String, value: Long) {
        val sharedPreferences = sContext!!.getSharedPreferences(cacheContainer, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        editor.putLong(key, value)
        editor.apply()
    }

    fun getLong(key: String): Long {
        val sharedPreferences = sContext!!.getSharedPreferences(cacheContainer, Context.MODE_PRIVATE)

        return sharedPreferences.getLong(key, 0)
    }


    fun putInt(key: String, value: Int) {
        val sharedPreferences = sContext!!.getSharedPreferences(cacheContainer, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        editor.putInt(key, value)
        editor.apply()
    }

    fun getInt(key: String): Int {
        val sharedPreferences = sContext!!.getSharedPreferences(cacheContainer, Context.MODE_PRIVATE)

        return sharedPreferences.getInt(key, 0)
    }

    fun clear() {
        sContext!!.getSharedPreferences(cacheContainer, Context.MODE_PRIVATE).edit().clear().apply()
    }

    companion object {

        private val TAG = StorePreference::class.java.simpleName

        val cacheContainer = "freeplay_container"
        private var sInstance: StorePreference? = null
        private var sContext: Context? = null

        fun getInstance(context: Context): StorePreference {
            if (sInstance == null) {
                sInstance = StorePreference()
            }
            sContext = context

            return sInstance!!
        }
    }
}