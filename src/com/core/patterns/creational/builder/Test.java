package com.core.patterns.creational.builder;

public class Test {
    public static void main(String[] args) {
        // new HttpClient("GET", "http://test.com", null, null, null, null);
        HttpClient httpClient = new HttpClient.HttpClientBuilder().method("POST").url("test-url").body("{}").build();
        System.out.println(httpClient);
    }
}
