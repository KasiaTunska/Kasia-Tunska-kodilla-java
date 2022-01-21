package challenges;

import challenges.InformationService;
import challenges.OrderDto;
import challenges.Repository;
import challenges.UserRecord;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService rentalService;
    private Repository rentalRepository;

    public ProductOrderService(final InformationService informationService,
                               final OrderService rentalService,
                               final Repository rentalRepository) {
        this.informationService = informationService;
        this.rentalService = rentalService;
        this.rentalRepository = rentalRepository;
    }

    public OrderDto process(final UserRecord rentRequest) {
        boolean isRented = rentalService.rent(rentRequest.getUser(), rentRequest.getOrderDate(), rentRequest.getPaymentDate());

        if (isRented) {
            informationService.inform(rentRequest.getUser());
            rentalRepository.createRental(rentRequest.getUser(), rentRequest.getOrderDate(), rentRequest.getPaymentDate());
            return new OrderDto(rentRequest.getUser(), true);
        } else {
            return new OrderDto(rentRequest.getUser(), false);
        }
    }
}