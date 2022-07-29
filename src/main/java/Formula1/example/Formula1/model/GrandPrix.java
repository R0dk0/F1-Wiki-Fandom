package Formula1.example.Formula1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "grandPrix")
public class GrandPrix {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String yearsHeld;

    @Column
    private String numberOfStarts;

    @OneToMany(mappedBy = "grandPrix")
    private List<Circuit> currentTrack;

    @OneToMany(mappedBy = "grandPrix")
    private List<Driver> mostSuccessfulDriver;

    @OneToMany(mappedBy = "grandPrix")
    private List<Team> mostSuccessfulTeam;



}
