package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ride {
    int id;
    String src;
    String destination;
    boolean ended;
    String givenByUser;
    String takenByUser;
    int availableSeats;
    Vehicle vehicle;
}
