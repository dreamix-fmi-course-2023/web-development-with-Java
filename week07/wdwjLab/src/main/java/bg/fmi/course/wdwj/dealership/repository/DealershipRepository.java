package bg.fmi.course.wdwj.dealership.repository;

import bg.fmi.course.wdwj.dealership.model.Dealership;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class DealershipRepository {
    private List<Dealership> dealershipDb = new ArrayList<>();

    public void addDealership(Dealership dealership) {
        dealershipDb.add(dealership);
    }

    public Optional<Dealership> getDealershipByName(String name) {
        return dealershipDb.stream()
                .filter(el -> el.getName().equals(name))
                .findFirst();
    }

    public List<Dealership> getAll() {
        return dealershipDb;
    }
}
