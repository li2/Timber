package com.naman14.timber.pip

import android.content.res.Configuration

/*
 * Created by Weiyi Li on 6/03/21.
 * https://github.com/li2
 */
interface PipModeChangedListener {
    fun onPipModeChanged(isInPipMode: Boolean, newConfig: Configuration)
}