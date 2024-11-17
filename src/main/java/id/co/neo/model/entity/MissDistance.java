package id.co.neo.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class MissDistance {
    @Id
    private Long id;
    private String astronomical;
    private String lunar;
    private String kilometers;
    private String miles;
}
