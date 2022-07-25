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
@Table(name = "nationalities")
public class Nationality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nationality;

    @OneToMany(mappedBy = "nationality")
    private List<Driver> drivers;

    @OneToMany(mappedBy = "nationality")
    private List<Team> teams;
}
