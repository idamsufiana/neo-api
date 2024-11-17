package id.co.neo.delivery;

import id.co.neo.exception.AziException;
import id.co.neo.service.HttpService;
import id.co.neo.usecase.MainUsecase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;
import java.text.ParseException;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/neo")
public class NeoController extends BaseController{

    @Autowired
    HttpService httpService;
    @Autowired
    MainUsecase mainUsecase;

    @RequestMapping(value = "/v1/ListTenClosestAsteroids", method = RequestMethod.GET)
    public ResponseEntity<?> getHistoricalSubStatus(@RequestParam(value = "StartDate") String start_date,
                                                    @RequestParam(value = "EndDate") String end_date) throws URISyntaxException, AziException {
        return this.success(mainUsecase.getData(start_date, end_date));

    }

    @RequestMapping(value = "/v2", method = RequestMethod.GET)
    public ResponseEntity<?> getHistoricalSubStatus(@RequestParam(value = "id") String id) throws ParseException, URISyntaxException {
        return httpService.getNeoLookUp(id);
    }

}
