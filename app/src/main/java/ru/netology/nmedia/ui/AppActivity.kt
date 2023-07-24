package ru.netology.nmedia.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.netology.nmedia.R

class AppActivity : AppCompatActivity(R.layout.activity_app) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val valuesList = listOf(
            500F,
            500F,
            500F,
            500F,
        )

        findViewById<StatsView>(R.id.stats).data = listOf(
            calcPercent(valuesList[0], valuesList),
            calcPercent(valuesList[1], valuesList),
            calcPercent(valuesList[2], valuesList),
            calcPercent(valuesList[3], valuesList),
        )
    }

    private fun calcPercent(value: Float, valuesList: List<Float>): Float {
        return value / valuesList.sum()
    }
}