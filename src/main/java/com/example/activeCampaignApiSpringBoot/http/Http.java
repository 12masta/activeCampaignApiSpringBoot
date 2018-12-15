package com.example.activeCampaignApiSpringBoot.http;

import com.example.activeCampaignApiSpringBoot.model.configuration.ConfigurationApi;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;

public class Http {

    private ConfigurationApi configurationApi;

    public Http(ConfigurationApi configurationApi) {
        this.configurationApi = configurationApi;
    }

    private static final MediaType JSON
            = MediaType.parse("application/json; charset=utf-8");

    OkHttpClient client = new OkHttpClient();

    public Response post(String endpoint, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(configurationApi.getUrl() + endpoint)
                .addHeader("Api-Token", configurationApi.getApiKey())
                .post(body)
                .build();
        return client.newCall(request).execute();
    }
}
