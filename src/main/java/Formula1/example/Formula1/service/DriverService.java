package Formula1.example.Formula1.service;

import Formula1.example.Formula1.exception.RecordNotFoundException;
import Formula1.example.Formula1.model.Driver;
import Formula1.example.Formula1.repository.DriverRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class DriverService {

    private final DriverRepository driverRepository;

    private final DriverService driverService;


    public DriverService(DriverRepository driverRepository, DriverService driverService) {
        this.driverRepository = driverRepository;
        this.driverService = driverService;
    }

    public Driver findByName(String name) {
        return driverRepository.findByName(name)
                .orElseThrow(() -> new RecordNotFoundException(String.format("Driver with this name not found",name)));
    }

    public Set<Driver> findAll() {
        return new HashSet<>(driverRepository.findAll());

    }

    public void save(Driver driver) {
        driverRepository.save(driver);
    }

    public Driver findByIdReturnDriver(Long id) {

        Driver driver = driverRepository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException(String.format("Driver with this id not exist.",id)));

        return Driver.builder()
                .driverImage(driver.getDriverImage())
                .name(driver.getName())
                .surname(driver.getSurname())
                .lastname(driver.getLastname())
                .born(driver.getBorn())
                .nationality(driver.getNationality())
                .carNumber(driver.getCarNumber())
                .currentTeam(driver.getCurrentTeam())
                .description(driver.getDescription())
                .fastestLaps(driver.getFastestLaps())
                .firstRace(driver.getFirstRace())
                .firstWin(driver.getFirstWin())
                .podiums(driver.getPodiums())
                .points(driver.getPoints())
                .poles(driver.getPoles())
                .wins(driver.getWins())
                .worldTitles(driver.getWorldTitles())
                .races(driver.getRaces())
                .seasonActivity(driver.getSeasonActivity())
                .previousTeams(driver.getPreviousTeams())
                .status(driver.getStatus())
                .latestRace(driver.getLatestRace())
                .latestWin(driver.getLatestWin())
                .build();

    }


}
