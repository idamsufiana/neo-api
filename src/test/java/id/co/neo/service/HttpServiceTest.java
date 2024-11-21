package id.co.neo.service;

import com.squareup.okhttp.HttpUrl;
import id.co.neo.model.dto.ApiResponse;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class HttpServiceTest {


    @Mock
    private HttpService MockHttpService;

    @Mock
    private RestTemplate restTemplate;


    void setup(){

        String api_key="DEMO_KEY";
        String neo_Feed = "https://api.nasa.gov/neo/rest/v1/feed";
        String neo_Lookup = "https://api.nasa.gov/neo/rest/v1/neo/";
    }


    @Test
    void testGetNeoFeed(){

        String neo_Feed = "https://api.nasa.gov/neo/rest/v1/feed";
        String api_key="DEMO_KEY";

        String startDate = "2024-01-01";
        String endDate = "2024-05-01";
        HttpUrl uri = HttpUrl.parse(neo_Feed)
                .newBuilder()
                .addQueryParameter("start_date",startDate)
                .addQueryParameter("end_date", endDate)
                .addQueryParameter("api_key", api_key)
                .build();

        ApiResponse response = new ApiResponse();
        ResponseEntity<ApiResponse> mockEntity = new ResponseEntity<>(response, HttpStatus.OK);

    }
}
