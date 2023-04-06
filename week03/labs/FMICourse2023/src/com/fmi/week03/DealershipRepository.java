package com.fmi.week03;

import java.util.ArrayList;
import java.util.List;

public class DealershipRepository {
    private List<Dealership> dealershipDb = new ArrayList<>();

    public void addDealership(Dealership dealership) {
        dealershipDb.add(dealership);
    }
}
