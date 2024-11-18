package id.co.neo.delivery;

import id.co.neo.exception.AziException;
import id.co.neo.service.HttpService;
import id.co.neo.usecase.NeoUsecase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;
import java.text.ParseException;

@RestController
@RequestMapping("/neo")
public class NeoController extends BaseController{

    @Autowired
    HttpService httpService;
    @Autowired
    NeoUsecase mainUsecase;

    @RequestMapping(value = "/v1/ListTenClosestAsteroids", method = RequestMethod.GET)
    public ResponseEntity<?> ListTenClosestAsteroids(@RequestParam(value = "StartDate") String start_date,
                                                     @RequestParam(value = "EndDate") String end_date) throws URISyntaxException, AziException {
        return this.success(mainUsecase.getData(start_date, end_date));

    }

    @RequestMapping(value = "/v1/SaveListClosestAsteroids", method = RequestMethod.GET)
    public ResponseEntity<?> SaveListClosestAsteroids(@RequestParam(value = "Year") String year) throws URISyntaxException, AziException {
        return this.success(mainUsecase.saveDataByYears(year));

    }

    @RequestMapping(value = "/v1/ListClosestAsteroidsDistance", method = RequestMethod.GET)
    public ResponseEntity<?> ListClosestAsteroidsDistance(@RequestParam(value = "StartDate") String start_date,
                                                          @RequestParam(value = "EndDate") String end_date,
                                                          @RequestParam(value = "Distance") Double distance  ) throws URISyntaxException, AziException {
        return this.success(mainUsecase.getDatawithDistance(start_date, end_date, distance));

    }

    @RequestMapping(value = "/v2", method = RequestMethod.GET)
    public ResponseEntity<?> getHistoricalSubStatus(@RequestParam(value = "id") String id) throws ParseException, URISyntaxException {
        return this.success(httpService.getNeoLookUp(id));
    }

}
