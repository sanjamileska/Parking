package lot.parking.Service;

import lot.parking.Entity.ParkingSpace;
import lot.parking.Repository.ParkingSpaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingSpaceService {

    @Autowired
    private ParkingSpaceRepository parkingSpaceRepository;

    public void save(ParkingSpace space) {
        parkingSpaceRepository.save(space);
    }

    public ParkingSpace findById(Long id) {
        return parkingSpaceRepository.findById(id)
                ;
    }

    public List<ParkingSpace> findAll() {
        return parkingSpaceRepository.findAll();
    }
}