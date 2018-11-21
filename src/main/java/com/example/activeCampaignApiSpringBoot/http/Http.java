package com.example.activeCampaignApiSpringBoot.http;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;

public class Http {
    private static final MediaType JSON
            = MediaType.parse("application/json; charset=utf-8");

    OkHttpClient client = new OkHttpClient();

    public Response post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .addHeader("Api-Token", "9a608aa095c1fb777c06fd4a69bb908d37934751e2dcce7f5702aaac50b9abb4bc0f77f1")
                .post(body)
                .build();
        return client.newCall(request).execute();
    }
}
