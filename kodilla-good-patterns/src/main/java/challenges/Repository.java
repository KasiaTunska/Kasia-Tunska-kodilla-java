package challenges;
import java.time.LocalDateTime;


public interface Repository {

        boolean createRental(User user, LocalDateTime from, LocalDateTime to);

}
