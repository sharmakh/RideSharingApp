package services.Impl;

import models.Ride;
import services.StratergySelection;

import java.util.List;
import java.util.stream.Collectors;

public class VehicleTypeSelectionStratergy extends StratergySelection {
    public String preferredVehicleType;

    public VehicleTypeSelectionStratergy(String preferredVehicleType){
        this.preferredVehicleType = preferredVehicleType;
    }
    @Override
    public List<Ride> selectRide(List<Ride> availableRides,String rideTakingUser,String src,String dest,int seat) {
        return availableRides.stream().filter(ride->ride.getSrc().equals(src) && ride.getDestination().equals(dest)
                && ride.getAvailableSeats()>=seat && ride.getVehicle().getMake().equals(this.preferredVehicleType))
                .collect(Collectors.toList());
    }
}
