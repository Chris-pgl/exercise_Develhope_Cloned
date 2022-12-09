public class Tester {
    public static void main(String[] args) {

        SmartphonePrice smartphonePrice1 = new SmartphonePrice("ProducerIphone",700);
        SmartphonePrice smartphonePrice2 = new SmartphonePrice("ProducerXiaomi",190);

        SmartphonePrice smartphonePrice3 = new SmartphonePrice("RetailIphone",1300);
        SmartphonePrice smartphonePrice4 = new SmartphonePrice("RetailXiaomi",390);

        Smartphone smartphone1 = new Smartphone("Iphone","Iphone13",1200,smartphonePrice1,smartphonePrice3);
        Smartphone smartphone2 = new Smartphone("Xiaomi","Mi 11 5G",1600,smartphonePrice2,smartphonePrice4);

        boolean out1 = smartphone1.equals(smartphone2);
        System.out.println(out1);

        try {
            Smartphone clonedSmarthPhone2 =  (Smartphone) smartphone2.clone();
            clonedSmarthPhone2.modelName = "Xiami";
            clonedSmarthPhone2.modelName = "Mi 11 5G";
            clonedSmarthPhone2.batterymAh = 1200;
            clonedSmarthPhone2.producerPrice = smartphonePrice1;
            clonedSmarthPhone2.retailPrice = smartphonePrice3;
            System.out.println(clonedSmarthPhone2);
            boolean out2 = clonedSmarthPhone2.equals(smartphone2);
            System.out.println("is equal to cloned "+ out2);
        }catch(Exception exception){
            exception.printStackTrace();
            System.out.println("Error");
        }
    }

}
