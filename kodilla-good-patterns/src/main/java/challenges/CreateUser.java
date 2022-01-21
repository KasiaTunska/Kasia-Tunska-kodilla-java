package challenges;



import java.time.LocalDateTime;

    public class CreateUser {



        public UserRecord createUserKasia() {

            User user = new User("Kasia", "Kowalsky");

            return new UserRecord(user);
        }


        public UserRecord createUserMati() {

            User user = new User("Mati", "Nowak");

            return new UserRecord(user);
        }

        public void setOrderDate(UserRecord userRecord) {
            LocalDateTime orderDate = LocalDateTime.of(1, 1, 1, 1, 1);
            if (userRecord.getUser().getSurname() == "Kowalsky" && userRecord.getUser().getName() == "Kasia") {
                orderDate = LocalDateTime.of(2022, 8, 2, 7, 22);
            }
            if (userRecord.getUser().getSurname() == "Nowak" && userRecord.getUser().getName() == "Mati") {
                orderDate = LocalDateTime.of(2022, 5, 1, 11, 00);
            }

            userRecord.setOrderDate(orderDate);
        }

        public void setPaymentDate(UserRecord userRecord) {
            LocalDateTime paymentDate = LocalDateTime.of(1, 1, 1, 1, 1);
            if (userRecord.getUser().getSurname() == "Kowalsky" && userRecord.getUser().getName() == "Kasia") {
                paymentDate = LocalDateTime.of(2022, 8, 2, 7, 23);
            }
            if (userRecord.getUser().getSurname() == "Nowak" && userRecord.getUser().getName() == "Mati") {
                paymentDate = LocalDateTime.of(2022, 5, 1, 12, 05);
            }

            userRecord.setPaymentDate(paymentDate);
        }
    }

