package id.co.neo.delivery;

import id.co.neo.common.CommonRs;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class BaseController {

    public ResponseEntity<Object> success(Object data) {
        return new ResponseEntity(new CommonRs(HttpStatus.OK.value(), "success", data), HttpStatus.OK);
    }

    public ResponseEntity<Object> error(Object data) {
        return new ResponseEntity(new CommonRs(HttpStatus.INTERNAL_SERVER_ERROR.value(), "error", data), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public ResponseEntity<Object> error(HttpStatus httpStatus, Object message) {
        return new ResponseEntity(new CommonRs(httpStatus.value(), "error", message), httpStatus);
    }
}
