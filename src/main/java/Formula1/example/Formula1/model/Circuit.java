package Formula1.example.Formula1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "circuits")
public class Circuit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Lob
    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private Integer length;

    @Column(nullable = false)
    private Integer capacity;

    @Column(nullable = false)
    private LocalDate opened;

    @ManyToOne
    @JoinColumn(name = "fastestLap_id", nullable = false)
    private FastestLap lapRecord;

    @ManyToOne
    @JoinColumn(name = "image_id" ,nullable = false)
    private Image circuitImage;
    @ManyToOne
    @JoinColumn(name = "grandPrix_id", nullable = false)
    private GrandPrix grandPrix;



}
