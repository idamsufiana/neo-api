package id.co.neo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RelativeVelocity {

    @JsonProperty("kilometers_per_second")
    private String kilometersPerSecond;

    @JsonProperty("kilometers_per_hour")
    private String kilometersPerHour;

    @JsonProperty("miles_per_hour")
    private String milesPerHour;
}
