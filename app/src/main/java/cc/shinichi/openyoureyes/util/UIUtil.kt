package cc.shinichi.openyoureyes.util

import android.content.Context
import android.graphics.Point
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.text.TextUtils
import android.view.WindowManager
import cc.shinichi.openyoureyes.app.App

object UIUtil {

  private val HOUR_SECOND = 60 * 60
  private val MINUTE_SECOND = 60

  fun getAppContext(): Context {
    return App
        .application
  }

  fun getPhoneWidth(): Int {
    val wm: WindowManager =
      getAppContext().getSystemService(Context.WINDOW_SERVICE) as WindowManager
    val outSize = Point()
    wm
        .defaultDisplay
        .getSize(outSize)
    return outSize
        .x
  }

  fun getPhoneHeight(): Int {
    val wm: WindowManager =
      getAppContext().getSystemService(Context.WINDOW_SERVICE) as WindowManager
    val outSize = Point()
    wm
        .defaultDisplay
        .getSize(outSize)
    return outSize
        .y
  }

  fun px2dp(pxValue: Int): Int {
    val scale = App.application
        .resources
        .displayMetrics
        .density
    return (pxValue / scale + 0.5f).toInt()
  }

  fun dp2px(dipValue: Int): Int {
    val scale = App.application
        .resources
        .displayMetrics
        .density
    return (dipValue * scale + 0.5f).toInt()
  }

  fun isNull(string: String?): Boolean {
    if (TextUtils.isEmpty(string) || "null" == string || " " == string) {
      return true
    }
    return false
  }

  fun scrollToTop(recyclerView: RecyclerView) {
    if (recyclerView.layoutManager is LinearLayoutManager) {
      recyclerView.layoutManager.scrollToPosition(0)
    }
  }

  fun getDurationText(second: Int?): String {
    var seconds = second
    if (seconds == null || seconds <= 0) {
      return "00:00"
    }

    val hours = seconds / HOUR_SECOND
    if (hours > 0) {
      seconds -= hours * HOUR_SECOND
    }

    val minutes = seconds / MINUTE_SECOND
    if (minutes > 0) {
      seconds -= minutes * MINUTE_SECOND
    }
    return if (hours > 0) {
      (if (hours >= 10) {
        (hours).toString() + ":"
      } else {
        "0$hours:"
      } + (if (minutes >= 10) {
        (minutes).toString() + ":"
      } else {
        "0$minutes:"
      }) + if (seconds >= 10) {
        (seconds).toString() + ":"
      } else {
        "0$seconds"
      })
    } else {
      if (minutes >= 10) {
        (minutes).toString() + ":"
      } else {
        "0$minutes:"
      } + (if (seconds >= 10) {
        (seconds).toString() + ""
      } else {
        "0$seconds"
      })
    }
  }
}