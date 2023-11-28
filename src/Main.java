import enums.Gender;
import enums.VehicleType;
import models.Ride;
import models.User;
import models.Vehicle;
import services.Impl.UserOnboardingServiceImpl;
import services.Impl.VehicleOnboardingServiceImpl;
import services.OfferRideService;
import services.OnboardingService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setId(1);
        user1.setName("Rohan");
        user1.setAge(36);
        user1.setGender(Gender.MALE);

        User user2 = new User();
        user2.setId(2);
        user2.setName("Shashank");
        user2.setAge(29);
        user2.setGender(Gender.MALE);

        User user3 = new User();
        user2.setId(3);
        user2.setName("Nandini");
        user2.setAge(29);
        user2.setGender(Gender.FEMALE);

        User user4 = new User();
        user4.setId(4);
        user4.setName("Shipra");
        user4.setAge(27);
        user4.setGender(Gender.FEMALE);

        User user5 = new User();
        user5.setId(5);
        user5.setName("Shipra");
        user5.setAge(27);
        user5.setGender(Gender.FEMALE);

        User user6 = new User();
        user6.setId(6);
        user6.setName("Rahul");
        user6.setAge(27);
        user6.setGender(Gender.MALE);

        OnboardingService onboardingService = new UserOnboardingServiceImpl();
        onboardingService.onboard(user1);
        onboardingService.onboard(user2);
        onboardingService.onboard(user3);
        onboardingService.onboard(user4);
        onboardingService.onboard(user5);
        onboardingService.onboard(user6);

        Vehicle v1 = new Vehicle();
        v1.setId(1);
        v1.setMake("Swift");
        v1.setUserName("Rohan");
        v1.setVehicleNumber("KA-01-12345");
        v1.setVehicleType(VehicleType.FOUR_WHEELER);

        Vehicle v2 = new Vehicle();
        v2.setId(2);
        v2.setMake("Baleno");
        v2.setUserName("Shashank");
        v2.setVehicleNumber("TS-05-62395");
        v2.setVehicleType(VehicleType.FOUR_WHEELER);

        Vehicle v3 = new Vehicle();
        v3.setId(3);
        v3.setMake("Polo");
        v3.setUserName("Shipra");
        v3.setVehicleNumber("KA-05-41491");
        v3.setVehicleType(VehicleType.FOUR_WHEELER);

        Vehicle v4 = new Vehicle();
        v4.setId(4);
        v4.setMake("Activa");
        v4.setUserName("Shipra");
        v4.setVehicleNumber("KA-12-12332");
        v4.setVehicleType(VehicleType.TWO_WHEELER);

        Vehicle v5 = new Vehicle();
        v5.setId(5);
        v5.setMake("XUV");
        v5.setUserName("Rahul");
        v5.setVehicleNumber("KA-05-1234");
        v5.setVehicleType(VehicleType.FOUR_WHEELER);

        OnboardingService vehicleOnboardingService = new VehicleOnboardingServiceImpl();
        vehicleOnboardingService.onboard(v1);
        vehicleOnboardingService.onboard(v2);
        vehicleOnboardingService.onboard(v3);
        vehicleOnboardingService.onboard(v4);
        vehicleOnboardingService.onboard(v5);

        Ride ride1 = new Ride();
        ride1.setEnded(false);
        ride1.setId(1);
        ride1.setSrc("Hyderabad");
        ride1.setDestination("Bangalore");
        ride1.setAvailableSeats(1);
        ride1.setGivenByUser("Rohan");
        ride1.setVehicle(v1);

        Ride ride2 = new Ride();
        ride2.setEnded(false);
        ride2.setId(2);
        ride2.setSrc("Bangalore");
        ride2.setDestination("Mysore");
        ride2.setAvailableSeats(1);
        ride2.setGivenByUser("Shipra");
        ride2.setVehicle(v4);

        Ride ride3 = new Ride();
        ride3.setEnded(false);
        ride3.setId(3);
        ride3.setSrc("Bangalore");
        ride3.setDestination("Mysore");
        ride3.setAvailableSeats(2);
        ride3.setGivenByUser("Shipra");
        ride3.setVehicle(v3);

        Ride ride4 = new Ride();
        ride4.setEnded(false);
        ride4.setId(4);
        ride4.setSrc("Hyderabad");
        ride4.setDestination("Bangalore");
        ride4.setAvailableSeats(2);
        ride4.setGivenByUser("Shashank");
        ride4.setVehicle(v2);


        Ride ride5 = new Ride();
        ride5.setEnded(false);
        ride5.setId(5);
        ride5.setSrc("Hyderabad");
        ride5.setDestination("Bangalore");
        ride5.setAvailableSeats(2);
        ride5.setGivenByUser("Shashank");
        ride5.setVehicle(v5);


        Ride ride6 = new Ride();
        ride6.setEnded(false);
        ride6.setId(6);
        ride6.setSrc("Bangalore");
        ride6.setDestination("Pune");
        ride6.setAvailableSeats(1);
        ride6.setGivenByUser("Shashank");
        ride6.setVehicle(v1);

        OfferRideService offerRideService = new OfferRideService();
        offerRideService.offerRide(ride1);
        offerRideService.offerRide(ride2);
        offerRideService.offerRide(ride3);
        offerRideService.offerRide(ride4);
        offerRideService.offerRide(ride5);
        offerRideService.offerRide(ride6);

        List<Ride> rides = new ArrayList<>();

        rides = offerRideService.selectRide("Nandini", "Bangalore", "Mysore", 1, "Most Vacant");
        System.out.println(rides);
        rides = offerRideService.selectRide("Gaurav", "Bangalore", "Mysore", 1, "Activa");
        System.out.println(rides);
        rides = offerRideService.selectRide("Shashank", "Mumbai", "Bangalore", 1, "Most Vacant");
        System.out.println(rides);
        rides = offerRideService.selectRide("Rohan", "Hyderabad", "Bangalore", 1, "Baleno");
        System.out.println(rides);
        rides = offerRideService.selectRide("Shashank", "Hyderabad", "Bangalore", 1, "Polo");
        System.out.println(rides);



    }
}

