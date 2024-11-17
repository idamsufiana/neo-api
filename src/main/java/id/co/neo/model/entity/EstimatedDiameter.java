package id.co.neo.model.entity;

import id.co.neo.model.dto.DiameterDto;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class EstimatedDiameter {

    @Id
    private Long id;
    @OneToOne
    private Diameter kilometers;
    @OneToOne
    private Diameter meters;
    @OneToOne
    private Diameter miles;
    @OneToOne
    private Diameter feet;
}
