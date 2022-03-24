package com.app.datacovidyardann.api

import com.app.datacovidyardann.model.IndonesiaResponse
import com.app.datacovidyardan.activity.ProvinceResponse
import retrofit2.Call
import retrofit2.http.GET


interface Api {
    @GET("casenumber.json")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>

    @GET("casenumberprovince.json")
    fun getProvince(): Call<ArrayList<ProvinceResponse>>
}