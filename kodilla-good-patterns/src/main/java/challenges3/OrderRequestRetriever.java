package challenges3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class OrderRequestRetriever {
    public OrderRequest retrieve() {

        User user = new User("Nick", "Inez", "Kolorowa 12/3e street Wroclaw", "22-124", "nick.inez@wp.pl", "123-456-789");

        List<Product> listOfProducts = new ArrayList<Product>();
        listOfProducts.add(new Product("Notebook","1234567890", 18, 1,"szt."));
        listOfProducts.add(new Product("Chocolate cream","0246813579", 10,1, "g."));
        listOfProducts.add(new Product("Gloves","0987654321", 30, 1,"p."));

        Order order = new Order(    27, LocalDateTime.of(2020, 10, 10, 15, 45),
                LocalDateTime.of(2020, 10, 17, 8, 30), listOfProducts   );

        return new OrderRequest(user, order);
    }
}