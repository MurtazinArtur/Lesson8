package api.test;

import api.PerformanceAPI;
import api.model.Car;
import api.model.User;
import api.utils.HttpClientConnector;
import api.utils.RestAssuredConnector;
import com.google.gson.JsonArray;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static api.utils.TestUtils.getResponseBodyAsJsonArray;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PerformanceLabApiTests {
    @Test
    @Tag("users")
    void getUsersTest() {
        PerformanceAPI performanceAPI = new PerformanceAPI();

        User[] users = performanceAPI.setConnection(new RestAssuredConnector()).getUsers().then().statusCode(200).extract().response().getBody().as(User[].class);

        assertNotNull(users);

        assertTrue(users.length > 0);
    }

    @Test
    @Tag("users")
    void getUsersHttpClientTest() throws IOException {
        PerformanceAPI performanceAPI = new PerformanceAPI().setConnection(new HttpClientConnector());
        JsonArray responseBody = getResponseBodyAsJsonArray(performanceAPI.getHttpClientUsers());

        assertNotNull(responseBody);
        assertTrue(responseBody.size() >= 1);
    }

    @Test
    @Tag("cars")
    void getCarsTest() {
        PerformanceAPI performanceAPI = new PerformanceAPI();
        Car[] cars = performanceAPI.setConnection(new RestAssuredConnector()).getCars().then().statusCode(200).extract().response().getBody().as(Car[].class);

        assertNotNull(cars);
        assertTrue(cars.length > 0);
    }

    @Test
    @Tag("cars")
    void getCarsHttpClientTest() throws IOException {
        PerformanceAPI performanceAPI = new PerformanceAPI().setConnection(new HttpClientConnector());
        JsonArray responseBody = getResponseBodyAsJsonArray(performanceAPI.getHttpClientCars());

        assertNotNull(responseBody);
        assertTrue(responseBody.size() > 0);
    }
}
