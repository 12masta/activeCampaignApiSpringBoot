package com.example.activeCampaignApiSpringBoot.reader;

import java.io.InputStream;

public class JsonReader {
    public InputStream getJsonFromResource(String fileName) {
        return JsonReader.class.getResourceAsStream("/" + fileName);
    }
}
