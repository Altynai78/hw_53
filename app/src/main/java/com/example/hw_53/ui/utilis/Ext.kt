package com.example.hw_53.ui.utilis

import android.widget.ImageView

class Ext
fun ImageView.loadImage(url: String?) {
    Picasso.get().load(url).into(this)
}
