package com.ivoberger.imageloadingtest

import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco

// Needs to be registered in manifest for image loading library
class ImageLoadingApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Fresco.initialize(this)
    }
}
