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
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String manufacturer;

    @Column
    private String designerName;

    @Column(nullable = false)
    private String yearsActive;

    @ManyToOne
    @JoinColumn(name = "wins_id", nullable = false)
    private Win wins;

    @Column(nullable = false)
    private Integer numberOfStarts;

    @Enumerated(EnumType.STRING)
    @ManyToOne
    @JoinColumn(name = "engines_id",nullable = false)
    private Engine engine;
    @ManyToOne
    @JoinColumn(name = "team_id" , nullable = false)
    private Team constructor;





}
