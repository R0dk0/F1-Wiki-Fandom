package Formula1.example.Formula1.repository;

import Formula1.example.Formula1.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DriverRepository extends JpaRepository<Driver,Long> {

    @Override
    Optional<Driver> findById(Long id);
    Optional<Driver> findByName(String name);
    //Optional<WorldTitle> findByWorldTitle(Integer worldTitle);
}
