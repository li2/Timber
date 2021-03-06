package com.naman14.timber.utils

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter("isVisible")
fun setViewVisible(view: View, isVisible: Boolean?) {
    view.visibility = (if (isVisible.orFalse()) View.VISIBLE else View.INVISIBLE)
}
