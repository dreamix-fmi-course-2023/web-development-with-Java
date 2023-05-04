package bg.fmi.course.wdwj.dealership.repository;

import bg.fmi.course.wdwj.dealership.model.Dealership;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface DealershipRepository extends JpaRepository<Dealership, Long> {

}
