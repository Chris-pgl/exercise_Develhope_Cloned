import java.util.Objects;

public class SmartphonePrice implements Cloneable{

    public String priceType;
    public double priceInEuros;

    public SmartphonePrice(String priceType, double princeInEuros){
        this.priceType = priceType;
        this.priceInEuros = princeInEuros;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        SmartphonePrice clonedSmartphonePrice = (SmartphonePrice)super.clone();
        return super.clone();
    }

    @Override
    public String toString() {
        return "SmartphonePrice{" +
                "priceType='" + priceType + '\'' +
                ", priceInEuro=" + priceInEuros +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice that = (SmartphonePrice) o;
        return Double.compare(that.priceInEuros, priceInEuros) == 0 && Objects.equals(priceType, that.priceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }


}
