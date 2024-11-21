package id.co.neo.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import id.co.neo.model.dto.MissDistanceDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CloseApproachData {

    @Id
    private Long id;
    @ManyToOne
    private Asteroid asteroid;

    @JsonProperty("close_approach_date")
    private String closeApproachDate;

    @JsonProperty("close_approach_date_full")
    private String closeApproachDateFull;

    @JsonProperty("epoch_date_close_approach")
    private String epochDateCloseApproach;

    @OneToOne
    @JsonProperty("relative_velocity")
    private RelativeVelocity relativeVelocity;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonProperty("miss_distance")
    @JoinColumn(name = "missDistance_id", referencedColumnName = "id")
    private MissDistance missDistance;

    @JsonProperty("orbiting_body")
    private String orbiting_body;
}
