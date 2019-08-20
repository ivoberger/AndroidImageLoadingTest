package com.ivoberger.imageloadingtest

import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco

class ImageLoadingApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Fresco.initialize(this)
    }
}
