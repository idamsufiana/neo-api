package id.co.neo.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CloseApproachDataDto {

    @JsonProperty("close_approach_date")
    private String closeApproachDate;

    @JsonProperty("close_approach_date_full")
    private String closeApproachDateFull;

    @JsonProperty("epoch_date_close_approach")
    private String epochDateCloseApproach;

    @JsonProperty("relative_velocity")
    private RelativeVelocityDto relativeVelocity;

    @JsonProperty("miss_distance")
    private MissDistanceDto missDistance;

    @JsonProperty("orbiting_body")
    private String orbiting_body;
}
