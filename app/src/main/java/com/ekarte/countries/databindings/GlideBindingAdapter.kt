package com.ekarte.countries.databindings

import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.Spinner
import androidx.databinding.BindingAdapter
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ekarte.countries.R

object GlideBindingAdapter {

    @JvmStatic
    @BindingAdapter("setGlide")
    fun setImageWithGlide(
        imageView: ImageView,
        url: String?) {

        val circularProgressDrawable = CircularProgressDrawable(imageView.context)
        circularProgressDrawable.strokeWidth = 5f
        circularProgressDrawable.centerRadius = 30f
        circularProgressDrawable.start()

        val requestOptions = RequestOptions()
            .placeholder(circularProgressDrawable)
            .override(250,250)

        Glide.with(imageView.context)
            .setDefaultRequestOptions(requestOptions)
            .load(url)
            .into(imageView)
    }
}