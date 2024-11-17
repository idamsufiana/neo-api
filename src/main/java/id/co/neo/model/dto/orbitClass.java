package id.co.neo.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class orbitClass {
    @JsonProperty("orbit_class_type")
    private String orbitClassType;
    @JsonProperty("orbit_class_description")
    private String orbitClassDescription;
    @JsonProperty("orbit_class_range")
    private String orbitClassRange;

}
