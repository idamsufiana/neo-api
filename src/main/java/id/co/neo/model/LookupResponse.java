package id.co.neo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class LookupResponse {

    @JsonProperty("links")
    private Links links;

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("designation")
    private String designation;

    @JsonProperty("nasa_jpl_url")
    private String nasaJplUrl;

    @JsonProperty("absolute_magnitude_h")
    private String absoluteMagnitudeH;

    @JsonProperty("estimated_diameter")
    private EstimatedDiameter estimatedDiameter;

    @JsonProperty("close_approach_data")
    private List<CloseApproachData> closeApproachData;

    @JsonProperty("orbital_data")
    private orbitalData orbitalData;
}
