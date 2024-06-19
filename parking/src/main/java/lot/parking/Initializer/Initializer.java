package lot.parking.Initializer;

import jakarta.annotation.PostConstruct;
import lot.parking.Entity.ParkingLot;
import lot.parking.Entity.ParkingRequest;
import lot.parking.Entity.ParkingSpace;
import lot.parking.Enum.ParkingRequestType;
import lot.parking.Enum.PrepaidCategorization;
import lot.parking.Repository.ParkingLotRepository;
import lot.parking.Repository.ParkingRequestRepository;
import lot.parking.Repository.ParkingSpaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Initializer {

    @Autowired
    private final ParkingRequestRepository parkingRequestRepository;
    @Autowired
    private final ParkingSpaceRepository parkingSpaceRepository;
    @Autowired
    private final ParkingLotRepository parkingLotRepository;


    public Initializer(ParkingRequestRepository parkingRequestRepository,
                                ParkingSpaceRepository parkingSpaceRepository,
                                ParkingLotRepository parkingLotRepository) {
        this.parkingRequestRepository = parkingRequestRepository;
        this.parkingSpaceRepository = parkingSpaceRepository;
        this.parkingLotRepository = parkingLotRepository;
    }

    @PostConstruct
    public void init() {
        initParkingRequests();
        initParkingSpaces();
        initParkingLot();
    }

    private void initParkingRequests() {
        List<ParkingRequest> parkingRequests = new ArrayList<>();
        parkingRequests.add(new ParkingRequest(1L, 1L, "ABC123", 50.0, ParkingRequestType.Hourly, 2, null));
        parkingRequests.add(new ParkingRequest(2L, 2L, "XYZ456", 100.0, ParkingRequestType.Prepaid, 0, PrepaidCategorization.Month));

        parkingRequests.forEach(parkingRequestRepository::save);
    }

    private void initParkingSpaces() {
        List<ParkingSpace> parkingSpaces = new ArrayList<>();
        parkingSpaces.add(new ParkingSpace(1L));
        parkingSpaces.add(new ParkingSpace(2L));

        parkingSpaces.forEach(parkingSpaceRepository::save);
    }

    private void initParkingLot() {
        ParkingLot parkingLot = new ParkingLot();
        parkingLotRepository.save(parkingLot);
    }
}