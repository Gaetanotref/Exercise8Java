import java.util.Objects;

public class Smartphone implements Cloneable{
    //VARIABLES
    private String brandName;
    private String modelName;
    private int batterymAh;
    private SmartphonePrice producerPrice;
    private SmartphonePrice retailPrice;
    //COSTRUCTOR METHOD
    public Smartphone(String brandName,String modelName,int batterymAh,SmartphonePrice producerPrice,SmartphonePrice retailPrice){
        this.brandName=brandName;
        this.modelName=modelName;
        this.batterymAh=batterymAh;
        this.producerPrice=producerPrice;
        this.retailPrice=retailPrice;
    }
    //OVERRIDE METHOD FROM OBJECT
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
    public Smartphone clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone = (Smartphone) super.clone();
        clonedSmartphone.producerPrice=producerPrice;
        clonedSmartphone.retailPrice=retailPrice;
        return clonedSmartphone;
    }
}
