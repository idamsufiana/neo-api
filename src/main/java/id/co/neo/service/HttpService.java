package id.co.neo.service;

import com.squareup.okhttp.HttpUrl;
import id.co.neo.model.ApiResponse;
import id.co.neo.model.LookupResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URISyntaxException;
import java.util.Collections;

@Service
@Slf4j
public class HttpService {

    @Value("${nasa.api.key}")
    private String apiKey;

    @Value("${neo_Feed}")
    private String neo_Feed;
    @Value("${neo_Lookup}")
    private String neo_Lookup;

    @Autowired
    Properties properties;

    @Autowired
    RestTemplate restTemplate;

    public ResponseEntity<ApiResponse> getNeofeed(String startDate, String endDate) throws URISyntaxException {
        HttpUrl uri = HttpUrl.parse(neo_Feed)
                .newBuilder()
                .addQueryParameter("start_date",startDate)
                .addQueryParameter("end_date", endDate)
                .addQueryParameter("api_key", apiKey)
                .build();

        log.info("[START INVOKE API neo Feed][{}][{}]", uri, apiKey);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        ResponseEntity<ApiResponse> response = restTemplate.exchange(uri.uri(),
                HttpMethod.GET,
                new HttpEntity(httpHeaders),
                ApiResponse.class);
        return response;
    }

    public ResponseEntity<LookupResponse> getNeoLookUp(String asteroidId) throws URISyntaxException {
        HttpUrl uri = HttpUrl.parse(neo_Lookup+asteroidId)
                .newBuilder()
                .addQueryParameter("api_key", apiKey)
                .build();

        log.info("[START INVOKE API neo Feed][{}][{}]", uri, apiKey);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        ResponseEntity<LookupResponse> response = restTemplate.exchange(uri.uri(),
                HttpMethod.GET,
                new HttpEntity(httpHeaders),
                LookupResponse.class);
        return response;
    }
}
