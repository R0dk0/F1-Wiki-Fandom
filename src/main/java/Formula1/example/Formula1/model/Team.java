package Formula1.example.Formula1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "teams")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Lob
    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private LocalDate createDate;
    @ManyToOne
    @JoinColumn(name = "nationality_id")
    private Nationality nationality;

    @ManyToOne
    @JoinColumn(name = "wins_id", nullable = false)
    private Win wins;

    @Column(nullable = false)
    private Integer numberOfRaces;

    @Column(nullable = false)
    @OneToMany(mappedBy = "team")
    private List<Driver> drivers;
    @ManyToOne
    private GrandPrix grandPrix;

    @OneToMany(mappedBy = "constructor")
    private List<Car> currentCar;

}
