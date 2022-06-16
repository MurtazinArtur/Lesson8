package api;

import api.utils.Connection;
import io.restassured.response.Validatable;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;

import java.io.IOException;

import static api.utils.TestUtils.getProperty;

public class PerformanceAPI {
    Connection connection;

    public Validatable getUsers() {
        return connection.getSpecification().get("/users");
    }

    public Validatable getCars() {
        return connection.getSpecification().get("/cars");
    }

    public CloseableHttpResponse getHttpClientUsers() throws IOException {
        HttpGet get = new HttpGet(getProperty("api.basepath") + "/users");
        return connection.getClient().execute(get);
    }

    public CloseableHttpResponse getHttpClientCars() throws IOException {
        HttpGet get = new HttpGet(getProperty("api.basepath") + "/cars");
        return connection.getClient().execute(get);
    }

    public PerformanceAPI setConnection(Connection connection) {
        this.connection = connection;
        return this;
    }
}
