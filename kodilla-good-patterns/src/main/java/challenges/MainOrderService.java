package challenges;


public class MainOrderService {
    public static void main(String[] args){
        CreateUser createUser = new CreateUser();

        UserRecord kasiaRecord = createUser.createUserKasia();
        createUser.setOrderDate(kasiaRecord);
        createUser.setPaymentDate(kasiaRecord);

        ProductOrderService productOrderService = new ProductOrderService(
                new MailService(), new ShoesOrderService(), new OrderRepository());
        productOrderService.process(kasiaRecord);

        UserRecord matiRecord = createUser.createUserMati();
        createUser.setOrderDate(matiRecord);
        createUser.setPaymentDate(matiRecord);

        ProductOrderService productOrderService1 = new ProductOrderService(
                new MailService(), new GameOrderService(), new OrderRepository());
        productOrderService1.process(matiRecord);

        ProductOrderService productOrderService2 = new ProductOrderService(
                new MailService(), new ToysOrderService(), new OrderRepository());
        productOrderService2.process(matiRecord);
    }
}