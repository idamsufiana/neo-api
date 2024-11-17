package id.co.neo.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EstimatedDiameterDto {
    private DiameterDto kilometers;
    private DiameterDto meters;
    private DiameterDto miles;
    private DiameterDto feet;
}
