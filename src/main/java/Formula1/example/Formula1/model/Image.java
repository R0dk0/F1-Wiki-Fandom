package Formula1.example.Formula1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "images")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imageId;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driver;

    @ManyToOne
    @JoinColumn(name = "circuit_id")
    private Circuit circuit;
}
