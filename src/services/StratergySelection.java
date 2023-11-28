package services;

import models.Ride;

import java.util.List;

public abstract class StratergySelection {

    public abstract List<Ride> selectRide(List<Ride> availableRides,String rideTakingUser,String sr,String dest,int seat);
}
