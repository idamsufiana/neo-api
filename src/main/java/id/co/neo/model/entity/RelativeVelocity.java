package id.co.neo.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class RelativeVelocity {

    @Id
    private Long id;

    @JsonProperty("kilometers_per_second")
    private String kilometersPerSecond;

    @JsonProperty("kilometers_per_hour")
    private String kilometersPerHour;

    @JsonProperty("miles_per_hour")
    private String milesPerHour;
}
