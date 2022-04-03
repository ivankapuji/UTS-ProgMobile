package com.ivankapuji.utsmobile.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class utsmobile(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)