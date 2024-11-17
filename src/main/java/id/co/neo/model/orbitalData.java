package id.co.neo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class orbitalData {

    @JsonProperty("orbit_id")
    private String orbitId;
    @JsonProperty("orbit_determination_date")
    private String orbitDeterminationDate;
    @JsonProperty("first_observation_date")
    private String firstObservationDate;
    @JsonProperty("last_observation_date")
    private String lastObservationDate;
    @JsonProperty("data_arc_in_days")
    private String dataArcInDays;
    @JsonProperty("observations_used")
    private String observations_used;
    @JsonProperty("orbit_uncertainty")
    private String orbit_uncertainty;
    @JsonProperty("minimum_orbit_intersection")
    private String minimum_orbit_intersection;
    @JsonProperty("jupiter_tisserand_invariant")
    private String jupiter_tisserand_invariant;
    @JsonProperty("epoch_osculation")
    private String epoch_osculation;
    @JsonProperty("eccentricity")
    private String eccentricity;
    @JsonProperty("semi_major_axis")
    private String semi_major_axis;
    @JsonProperty("inclination")
    private String inclination;
    @JsonProperty("ascending_node_longitude")
    private String ascending_node_longitude;
    @JsonProperty("orbital_period")
    private String orbital_period;
    @JsonProperty("perihelion_distance")
    private String perihelion_distance;
    @JsonProperty("perihelion_argument")
    private String perihelion_argument;
    @JsonProperty("aphelion_distance")
    private String aphelion_distance;
    @JsonProperty("perihelion_time")
    private String perihelion_time;
    @JsonProperty("mean_anomaly")
    private String mean_anomaly;
    @JsonProperty("mean_motion")
    private String mean_motion;
    @JsonProperty("equinox")
    private String equinox;
    @JsonProperty("orbit_class")
    private orbitClass orbitClass;

}
