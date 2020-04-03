package com.example.upsthemeswitch
import android.app.Activity
import android.content.Intent


object Utils {
    private var sTheme = -1
    var currentPosition:Int = -1

    private const val THEME_RED = 0
    private const val THEME_GREEN = 1
    private const val THEME_BLUE = 2

    fun changeToTheme(activity: Activity, theme: Int) {
        sTheme = theme
        activity.finish()
        activity.startActivity(Intent(activity, activity.javaClass))
        activity.overridePendingTransition(
            android.R.anim.fade_in,
            android.R.anim.fade_out
        )
    }

    fun onActivityCreateSetTheme(activity: Activity) {
        when (sTheme) {
            THEME_RED -> activity.setTheme(R.style.AppThemeRed)
            THEME_GREEN -> activity.setTheme(R.style.AppThemeGreen)
            THEME_BLUE -> activity.setTheme(R.style.AppThemeBlue)
        }
    }
}