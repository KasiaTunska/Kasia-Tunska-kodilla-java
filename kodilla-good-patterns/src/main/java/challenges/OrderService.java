package challenges;

import java.time.LocalDateTime;

interface OrderService {
    boolean rent(User user, LocalDateTime from, LocalDateTime to);

}
