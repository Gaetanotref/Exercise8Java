import java.util.concurrent.ExecutionException;

public class Tester {
    public static void main(String[] args) {
        //CREATING SMARTPHONE PRICE OBJECT
        SmartphonePrice priceRetail1 = new SmartphonePrice("Bho",324);
        SmartphonePrice priceRetail2 = new SmartphonePrice("Bho2",1234);

        SmartphonePrice priceProducer1 = new SmartphonePrice("Bho3",12);
        SmartphonePrice priceProducer2 = new SmartphonePrice("Bho4",1234);
        //CREATING SMARTPHONE OBJECT
        Smartphone smartphone1 = new Smartphone("Samsung","Modello1",321,priceProducer1,priceRetail1);
        Smartphone smartphone2 = new Smartphone("Iphone","Modello2",123,priceProducer2,priceRetail2);
        //OBJECT METHOD
        String smartphone1Details= smartphone1.toString();
        String smartphone2Details = smartphone2.toString();
        System.out.println(smartphone1Details);
        System.out.println(smartphone2Details);

        boolean areEquals = smartphone1.equals(smartphone2);
        System.out.println("Smartphone are equals? " +areEquals);
        //TRY CATCH
        try{
            Smartphone clonedSmartphone = smartphone2.clone();
            System.out.println(clonedSmartphone.toString());
            System.out.println(smartphone2.equals(clonedSmartphone));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERROR");}
    }
}
