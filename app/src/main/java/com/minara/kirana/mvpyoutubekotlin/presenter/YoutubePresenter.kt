package com.minara.kirana.mvpyoutubekotlin.presenter

import com.minara.kirana.kumpulanvideokotlin.ui.main.entity.ResultVideo
import com.minara.kirana.mvpyoutubekotlin.ui.network.NetworkConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


// TODO 13
class YoutubePresenter (val youtubeView: YoutubeView) {

    fun getData(q:String){
        // memanggil object network sesuai dengan query di service interface
        NetworkConfig.service(). getVideo("snippet","$q","key youtube")
            .enqueue(object : Callback<ResultVideo>{
                override fun onFailure(call: Call<ResultVideo>, t: Throwable) {

                }

                override fun onResponse(call: Call<ResultVideo>, response: Response<ResultVideo>) {
                    if (response.isSuccessful){

                        // ingat data tidak bisa langsung diterima oleh si view tapi harus menggunakan
                        // kelas contract atau interface view terlebih dahulu

                        youtubeView.onSuccess(response.body()?.items)
                    }
                }

            })
    }
}