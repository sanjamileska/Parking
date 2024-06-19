package lot.parking.Service;

import lot.parking.Entity.ParkingRequest;
import lot.parking.Repository.ParkingRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingRequestService {

    @Autowired
    private ParkingRequestRepository parkingRequestRepository;

    public void save(ParkingRequest request) {
        parkingRequestRepository.save(request);
    }

    public void delete(Long id) {
        parkingRequestRepository.delete(id)
        ;
    }

    public ParkingRequest findById(Long id) {
        return parkingRequestRepository.findById(id)
                ;
    }

    public List<ParkingRequest> findAll() {
        return parkingRequestRepository.findAll();
    }
}