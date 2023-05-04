package bg.fmi.course.wdwj.dealership.repository;

import bg.fmi.course.wdwj.dealership.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

}
