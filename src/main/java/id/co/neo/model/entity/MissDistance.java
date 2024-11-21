package id.co.neo.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class MissDistance {
    @Id
    private Long id;
    @OneToOne(mappedBy = "missDistance")
    private CloseApproachData closeApproachData;
    private String astronomical;
    private String lunar;
    private String kilometers;
    private String miles;
}
