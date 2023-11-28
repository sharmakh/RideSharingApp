package services.Impl;

import models.User;
import services.OnboardingService;

import java.util.ArrayList;
import java.util.List;

public class UserOnboardingServiceImpl extends OnboardingService {

    public List<User> users;

    public UserOnboardingServiceImpl(){
        users = new ArrayList<>();
    }
    @Override
    public void onboard(Object object) {
        users.add((User) object);
    }
}
