package com.uni.fmi.lab02.collections;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightMain {

    public static void main(String[] args) {
        Map<String, List<FlightLeg>> flights = new HashMap<>();

        List<FlightLeg> hLegs = new ArrayList<>();

        hLegs.add(new FlightLeg("LBSF", "LBPD", LocalDateTime.now()));
        hLegs.add(new FlightLeg("LBWD", "LBWS", LocalDateTime.now().plusDays(1)));
        hLegs.add(new FlightLeg("LBRF", "LBQD", LocalDateTime.now().plusDays(12)));

        flights.put("9H-VCA", hLegs);
        List<FlightLeg> gLegs = new ArrayList<>();

        gLegs.add(new FlightLeg("LBSF", "LBPD", LocalDateTime.now()));
        gLegs.add(new FlightLeg("WSWD", "WSWS", LocalDateTime.now().plusDays(1)));
        gLegs.add(new FlightLeg("LBSF", "wBQD", LocalDateTime.now().plusDays(12)));

        flights.put("9B-VCB", gLegs);
        String from = "LBSF";
        List<FlightLeg> resultLegs = new ArrayList<>();
//        for (Map.Entry<String, List<FlightLeg>> entry : flights.entrySet()) {
//            for (FlightLeg flightLeg : entry.getValue()) {
//                if(flightLeg.getFrom().equals(from)){
//                    resultLegs.add(flightLeg);
//                }
//            }
//        }

//        for (Map.Entry<String, List<FlightLeg>> entry : flights.entrySet()) {
//            List<FlightLeg> collect = entry.getValue()
//                    .stream()
//                    .filter(leg -> leg.getFrom().equals(from))
//                    .collect(Collectors.toList());
//            resultLegs.addAll(collect);
//
//        }

//        resultLegs.forEach(System.out::println);
        flights.values()
                .stream()
                .flatMap(list -> list.stream())
                .filter(leg -> leg.getFrom().equals(from))
                .forEach(System.out::println);

        flights.values()
                .stream()
                .flatMap(list -> list.stream())
                .filter(leg -> leg.getFrom().equals(from))
                .map( flightLeg -> flightLeg.getTo())
                .forEach(System.out::println);
    }
}
