package com.example.demo.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Ashwin727722eucs024AppConfig {

    @Value("${app.name}")
    private static String appName;

    @Value("${app.version}")
    private static String appVersion;

    public Ashwin727722eucs024AppConfig(@Value("${app.name}") String appName, @Value("${app.version}") String appVersion) {
        Ashwin727722eucs024AppConfig.appName = appName;
        Ashwin727722eucs024AppConfig.appVersion = appVersion;
    }

    public static String getAppName() {
        return appName;
    }

    public static String getAppVersion() {
        return appVersion;
    }

    public void setAppName(String appName) {
        Ashwin727722eucs024AppConfig.appName = appName;
    }

    public void setAppVersion(String appVersion) {
        Ashwin727722eucs024AppConfig.appVersion = appVersion;
    }
}
