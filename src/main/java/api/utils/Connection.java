package api.utils;

import io.restassured.specification.RequestSpecification;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;

public interface Connection {
    default CloseableHttpClient getClient(){
        return null;
    }
    default RequestSpecification getSpecification(){
        return null;
    }
}
