package com.minara.kirana.mvpyoutubekotlin.presenter

import com.minara.kirana.kumpulanvideokotlin.ui.main.entity.Item

// TODO 14
interface YoutubeView {

    fun onSuccess(items:List<Item>?)
    fun onError(msg:String)
}