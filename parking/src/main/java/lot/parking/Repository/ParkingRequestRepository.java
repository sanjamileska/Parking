package lot.parking.Repository;

import lot.parking.Entity.ParkingRequest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ParkingRequestRepository {
    private List<ParkingRequest> parkingRequests = new ArrayList<>();


    public void save(ParkingRequest request) {
        parkingRequests.add(request);
    }

    public void delete(Long id) {
        parkingRequests.removeIf(request -> request.getId().equals(id));
    }

    public ParkingRequest findById(Long id) {
        return parkingRequests.stream()
                .filter(request -> request.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<ParkingRequest> findAll() {
        return parkingRequests;
    }
}

