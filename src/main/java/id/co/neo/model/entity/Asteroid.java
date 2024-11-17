package id.co.neo.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Asteroid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @JsonProperty("nasa_jpl_url")
    private String nasaJplUrl;

    @JsonProperty("absolute_magnitude_h")
    private double absoluteMagnitudeH;

    @JsonProperty("estimated_diameter")
    @OneToOne
    private EstimatedDiameter estimatedDiameter;

    @JsonProperty("is_potentially_hazardous_asteroid")
    private boolean isPotentiallyHazardousAsteroid;

    @JsonProperty("close_approach_data")
    @OneToMany
    private List<CloseApproachData> closeApproachData;
}
