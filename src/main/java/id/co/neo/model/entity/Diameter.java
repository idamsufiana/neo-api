package id.co.neo.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Diameter {

    @Id
    private Long Id;

    @JsonProperty("estimated_diameter_min")
    private String estimatedDiameterMin;

    @JsonProperty("estimated_diameter_max")
    private String estimatedDiameterMax;
}
