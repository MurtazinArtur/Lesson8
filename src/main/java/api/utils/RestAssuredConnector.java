package api.utils;

import io.restassured.specification.RequestSpecification;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;

import static api.utils.TestUtils.getProperty;
import static io.restassured.RestAssured.given;

public class RestAssuredConnector implements Connection{
    @Override
    public RequestSpecification getSpecification() {
        return given().baseUri(getProperty("api.basepath")).when();
    }
}
