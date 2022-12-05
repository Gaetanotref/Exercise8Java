import java.util.Objects;

public class SmartphonePrice implements Cloneable {
    //VARIABLES
    private String priceType;
    private double priceInEuros;

    //COSTRUCTOR METHOD
    public SmartphonePrice(String priceType,double priceInEuros){
        this.priceType=priceType;
        this.priceInEuros=priceInEuros;
    }

    //OVERRIDE METHOD
    @Override
    protected SmartphonePrice clone() throws CloneNotSupportedException {
        SmartphonePrice clonedSmartphonePrice = (SmartphonePrice) super.clone();
        return clonedSmartphonePrice;
    }

    @Override
    public String toString() {
        return "SmartphonePrice{" +
                "priceType='" + priceType + '\'' +
                ", priceInEuros=" + priceInEuros +
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
