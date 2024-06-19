package lot.parking.Repository;

import lot.parking.Entity.ParkingSpace;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ParkingSpaceRepository {
    private List<ParkingSpace> parkingSpaces = new ArrayList<>();



    public void save(ParkingSpace space) {
        parkingSpaces.add(space);
    }

    public ParkingSpace findById(Long id) {
        return parkingSpaces.stream()
                .filter(space -> space.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<ParkingSpace> findAll() {
        return parkingSpaces;
    }
}