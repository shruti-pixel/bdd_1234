package factory.API;

import configs.LoadEnvironmentalConfig;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.IOException;

public class JsonPlaceHolderEvent {
    LoadEnvironmentalConfig loadEnvironmentalConfig = new LoadEnvironmentalConfig();
    RequestSpecification requestspecification = RestAssured.given();
    Response response;

    public JsonPlaceHolderEvent() throws IOException {
    }

    public void performGETMethod() {
        System.out.println("request URL "+getJsonPlaceHolderUrl());
        response = requestspecification.get(getJsonPlaceHolderUrl());
        System.out.println("response "+response.asString());
    }

    private String getJsonPlaceHolderUrl() {
        return loadEnvironmentalConfig.properties.getProperty("url");
    }
}
