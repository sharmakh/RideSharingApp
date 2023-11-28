package services.Impl;

import models.Vehicle;
import services.OnboardingService;

import java.util.ArrayList;
import java.util.List;

public class VehicleOnboardingServiceImpl extends OnboardingService {

    public List<Vehicle> vehicles;

    public VehicleOnboardingServiceImpl(){
        vehicles = new ArrayList<>();
    }

    @Override
    public void onboard(Object object) {
        vehicles.add((Vehicle) object);
    }
}
