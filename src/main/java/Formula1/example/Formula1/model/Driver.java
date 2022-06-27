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
@Table(name = "drivers")

public class Driver {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @Column(nullable = false)
    private String lastname;

    @ManyToOne
    @JoinColumn (name = "image_id", nullable = false)
    private Image driverImage;

    @Lob
    @Column(nullable = false)
    private String description;

    @Column
    private String born;

    @ManyToOne
    @JoinColumn (name = "nationality_id", nullable = false)
    private Nationality nationality;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private String seasonActivity;

    @ManyToOne
    @JoinColumn(name = "carNumber_id", nullable = false)
    private CarNumber carNumber;

    @Column(nullable = false)
    private String currentTeam;

    @Column(nullable = false)
    private String previousTeams;

    @ManyToOne
    @JoinColumn(name = "wordTitles_id", nullable = false)
    private WorldTitle worldTitles;

    @Column(nullable = false)
    private String races;

    @ManyToOne
    @JoinColumn(name = "poles_id", nullable = false)
    private PolePosition poles;

    @ManyToOne
    @JoinColumn(name = "wins_id", nullable = false)
    private Win wins;

    @ManyToOne
    @JoinColumn(name = "podiums_id", nullable = false)
    private Podium podiums;

    @ManyToOne
    @JoinColumn(name = "fastestLaps_id", nullable = false)
    private FastestLap fastestLaps;

    @ManyToOne
    @JoinColumn(name = "points_id", nullable = false)
    private Point points;

    @Column(nullable = false)
    private String firstRace;

    @Column(nullable = false)
    private String latestRace;

    @Column(nullable = false)
    private String firstWin;

    @Column(nullable = false)
    private String latestWin;



}
