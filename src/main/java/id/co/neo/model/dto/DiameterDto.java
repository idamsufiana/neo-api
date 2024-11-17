package id.co.neo.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DiameterDto {

    @JsonProperty("estimated_diameter_min")
    private String estimatedDiameterMin;

    @JsonProperty("estimated_diameter_max")
    private String estimatedDiameterMax;
}
