package id.co.neo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CloseApproachData {

    @JsonProperty("close_approach_date")
    private String closeApproachDate;

    @JsonProperty("close_approach_date_full")
    private String closeApproachDateFull;

    @JsonProperty("epoch_date_close_approach")
    private String epochDateCloseApproach;

    @JsonProperty("relative_velocity")
    private RelativeVelocity relativeVelocity;

    @JsonProperty("miss_distance")
    private MissDistance missDistance;

    @JsonProperty("orbiting_body")
    private String orbiting_body;
}
