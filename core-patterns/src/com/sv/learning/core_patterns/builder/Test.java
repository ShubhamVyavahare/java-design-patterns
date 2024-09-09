package com.sv.learning.core_patterns.builder;

public class Test {

    public static void main(String[] args) {

        HttpClient client = new HttpClient.HttpClientBuilder()
                .method("POST")
                .url("http://test.com")
                .body("{}")
                .secure("user", "pass")
                .build();

        System.out.println(client);

    }

}
