import java.util.Objects;

public class Smartphone implements Cloneable{


        public String brandName;
        public String modelName;
        public int batterymAh;
        public SmartphonePrice producerPrice;
        public SmartphonePrice retailPrice;


        @Override
        public String toString() {
            return "Smartphone{" +
                    "brandName='" + brandName + '\'' +
                    ", modelName='" + modelName + '\'' +
                    ", batterymAh=" + batterymAh +
                    ", producerPrice=" + producerPrice +
                    ", retailPrice=" + retailPrice +
                    '}';
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return batterymAh == that.batterymAh && Objects.equals(brandName, that.brandName) && Objects.equals(modelName, that.modelName) && Objects.equals(producerPrice, that.producerPrice) && Objects.equals(retailPrice, that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPrice, retailPrice);
    }

    @Override
        protected Object clone() throws CloneNotSupportedException {
            Smartphone clonedSmartphone = (Smartphone)super.clone();
            clonedSmartphone.producerPrice = this.producerPrice;
            clonedSmartphone.retailPrice = this.retailPrice;
            return super.clone();
        }

    public Smartphone(String brandName, String modelName, int batterymAh,SmartphonePrice prodP, SmartphonePrice retailP){
        this.brandName = brandName;
        this.modelName = modelName;
        this.batterymAh = batterymAh;
        prodP.priceType = "ProducerPrice";
        retailP.priceType = "RetailPrice";
        System.out.println(brandName + " - "+ modelName + " - "+ batterymAh + " - "+ prodP + " - "+ retailP);



    }

}