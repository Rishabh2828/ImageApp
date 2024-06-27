package com.shurish.imageapp

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("sfw/waifu")
    fun getWaifuImage(): Call<ImageResponse>

    @GET("sfw/neko")
    fun getNekoImage(): Call<ImageResponse>

    @GET("sfw/shinobu")
    fun getShinobuImage(): Call<ImageResponse>
}