package com.example.androidlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.supercharge.shimmerlayout.ShimmerLayout

class shimmerLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.shimmerlayout)

        val layout: ShimmerLayout = findViewById(R.id.shimmer_layout)
        layout.startShimmerAnimation()

    }
}