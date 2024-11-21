package id.co.neo.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import id.co.neo.model.entity.Asteroid;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.List;

@Getter
@Setter
public class ApiResponse {

    @JsonProperty("links")
    private Links links;

    @JsonProperty("element_count")
    private int elementCount;

    @JsonProperty("near_earth_objects")
    private Map<String, List<NeoObject>> nearEarthObjects;

    @JsonProperty("near_earth_objects")
    private Map<String, List<Asteroid>> realData;

}
