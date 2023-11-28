package services.Impl;

import models.Ride;
import services.StratergySelection;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MostVacantStratergy extends StratergySelection {
    @Override
    public List<Ride> selectRide(List<Ride> availableRides,String rideTakingUser,String src,String dest,int seat) {
        return availableRides.stream().filter(ride->ride.getSrc().equals(src) && ride.getDestination().equals(dest)
        &&ride.getAvailableSeats()>=seat).sorted(Comparator.comparingInt(Ride::getAvailableSeats).reversed())
                .collect(Collectors.toList());
    }
}
