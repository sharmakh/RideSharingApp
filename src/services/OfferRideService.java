package services;

import models.Ride;
import services.Impl.MostVacantStratergy;
import services.Impl.VehicleTypeSelectionStratergy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OfferRideService {
    public List<Ride> availableRide;

    public OfferRideService(){
        this.availableRide = new ArrayList<>();
    }

    public void offerRide(Ride ride){
        this.availableRide.add(ride);
    }
    public void endRide(int rideId){
        List<Ride> endRide = this.availableRide.stream().filter(ride -> ride.getId() == rideId).toList();
        endRide.get(0).setEnded(true);
    }
    public List<Ride> selectRide(String username,String src,String dest,int noOfSeats,String criteria){
        StratergySelection stratergySelection;
        if ("Most Vacant".equals(criteria)){
            stratergySelection = new MostVacantStratergy();
        }
        else{
            stratergySelection = new VehicleTypeSelectionStratergy(criteria);
        }
        return stratergySelection.selectRide(this.availableRide,username,src,dest,noOfSeats);

    }

}
