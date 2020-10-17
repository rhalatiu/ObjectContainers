package school.siit;

public class Address {
    private Integer streetNumber;
    private String streetName;
    private String country;

    public Address(String streetName, Integer streetNumber, String country){
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.country = country;
    }

    public Integer getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCountry() {
        return country;
    }
}