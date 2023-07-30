package primer.api.primerApi.entitie;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="lead")
public class Lead {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "email")
    private String email;

}
