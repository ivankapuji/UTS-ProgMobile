package com.ivankapuji.utsmobile.data

import com.ivankapuji.utsmobile.R
import com.ivankapuji.utsmobile.model.utsmobile

class Datasource() {

    fun loadutsmobile(): List<utsmobile> {
        return listOf<utsmobile>(
            utsmobile(R.string.utsmobile1, R.drawable.image1),
            utsmobile(R.string.utsmobile2, R.drawable.image2),
            utsmobile(R.string.utsmobile3, R.drawable.image3),
            utsmobile(R.string.utsmobile4, R.drawable.image4),
            utsmobile(R.string.utsmobile5, R.drawable.image5),
            utsmobile(R.string.utsmobile6, R.drawable.image6),
            utsmobile(R.string.utsmobile7, R.drawable.image7),
            utsmobile(R.string.utsmobile8, R.drawable.image8),
            utsmobile(R.string.utsmobile9, R.drawable.image9),
            utsmobile(R.string.utsmobile10, R.drawable.image10)
        )
    }
}