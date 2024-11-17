package id.co.neo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EstimatedDiameter {
    private Diameter kilometers;
    private Diameter meters;
    private Diameter miles;
    private Diameter feet;
}
