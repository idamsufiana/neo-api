package id.co.neo.usecase;

import id.co.neo.exception.AziException;
import id.co.neo.model.dto.ApiResponse;
import id.co.neo.model.dto.NeoObject;
import id.co.neo.service.HttpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Slf4j
public class NeoUsecase {


    @Autowired
    HttpService httpService;

    @Value("${limit}")
    private Long limit;

    private final String firstYear = "-01-01";
    private final String endYear = "-12-31";

    public Object getData(String starDate, String endDate) throws URISyntaxException, AziException {
        ResponseEntity<ApiResponse> response = httpService.getNeofeed(starDate, endDate);

        try{
            ApiResponse apiResponse = response.getBody();
            List<NeoObject> data = apiResponse.getNearEarthObjects().values()
                    .stream()
                    .flatMap(Collection::stream)
                    .collect(Collectors.toList());

            List<NeoObject> result = data.stream().sorted(Comparator.comparingDouble( neo ->
                    Double.parseDouble(neo.getCloseApproachData().get(0).getMissDistance().getKilometers())
            )).limit(limit).collect(Collectors.toList());
            return result;

        } catch (Exception e) {
            throw new AziException(e);

        }

    }

    public Object saveDataByYears(String Year) throws URISyntaxException, AziException {
        String starDate = Year+firstYear;
        String endDate = Year+endYear;
        ResponseEntity<ApiResponse> response = httpService.getNeofeed(starDate, endDate);

        try{
            ApiResponse apiResponse = response.getBody();
            List<NeoObject> data = apiResponse.getNearEarthObjects().values()
                    .stream()
                    .flatMap(Collection::stream)
                    .collect(Collectors.toList());

            List<NeoObject> result = data.stream().sorted(Comparator.comparingDouble( neo ->
                    Double.parseDouble(neo.getCloseApproachData().get(0).getMissDistance().getKilometers())
            )).limit(limit).collect(Collectors.toList());
            return result;

        } catch (Exception e) {
            throw new AziException(e);

        }

    }

    public Object getDatawithDistance(String starDate, String endDate, Double distance) throws URISyntaxException, AziException {
        ResponseEntity<ApiResponse> response = httpService.getNeofeed(starDate, endDate);

        try{
            ApiResponse apiResponse = response.getBody();
            List<NeoObject> data = apiResponse.getNearEarthObjects().values()
                    .stream()
                    .flatMap(Collection::stream)
                    .collect(Collectors.toList());

            List<NeoObject> result = data
                    .stream()
                    .filter(neo ->
                    Double.parseDouble(neo.getCloseApproachData().get(0).getMissDistance().getKilometers()) > distance).sorted(Comparator.comparingDouble( neo ->
                            Double.parseDouble(neo.getCloseApproachData().get(0).getMissDistance().getKilometers())
                    )).limit(limit).collect(Collectors.toList());
            return result;

        } catch (Exception e) {
            throw new AziException(e);

        }

    }
}
