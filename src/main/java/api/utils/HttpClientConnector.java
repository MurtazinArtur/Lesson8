package api.utils;

import io.restassured.specification.RequestSpecification;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;

public class HttpClientConnector implements Connection{
    @Override
    public CloseableHttpClient getClient() {
        return HttpClients.createDefault();
    }
}
