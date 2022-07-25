package Formula1.example.Formula1.controller;

import Formula1.example.Formula1.model.Driver;
import Formula1.example.Formula1.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class DriverController {

    private final DriverService driverService;
    @Autowired
    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @GetMapping(value = "/drivers")
    public Set<Driver> findAll() {
        return driverService.findAll();
    }

    @GetMapping(value = "/{name}")
    public Driver findByName(@PathVariable(value = "name") String name) {
        return driverService.findByName(name);
    }

    @GetMapping(value = "/{id}")
    public Driver findById(@PathVariable(value = "id") Long id) {
        return driverService.findById(id);
    }

    @PostMapping(value = "/save")
    public void save(@RequestBody Driver driver) {
        driverService.save(driver);
    }


}
