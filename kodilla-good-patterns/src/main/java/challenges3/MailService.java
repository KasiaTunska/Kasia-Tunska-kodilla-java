package challenges3;


public class MailService implements InformationService {

    public void inform(User getUser) {

        System.out.println("\nSending data of order on email...\nE-mail:\t" + getUser.getAddressEmail());
    }
}