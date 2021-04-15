package com.readytofire.letschat.Fragments;

import com.readytofire.letschat.Notifications.MyResponse;
import com.readytofire.letschat.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAveFkeyU:APA91bEYC1yDuYu49RyWzSwXc2uDEZ9CKSejjK5HygvRIE6e5mF1l15hvyTPhBKdzFjjVPSoSsxxKZsuo0Z-cUE_IuahprmDS28zj55MQu0fH3cpUL9bUFsojHF6EGrBZGnU4nNdeRUv"

    })
    @POST("fcm/send")
     Call<MyResponse> sendNotification(@Body Sender body);
}






