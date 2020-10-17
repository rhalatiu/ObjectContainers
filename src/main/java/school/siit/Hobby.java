package school.siit;

import java.util.List;

public class Hobby {
    private String nameOfHobby;
    private int frequency;
    List<Address> addresses;

    public Hobby(String nameOfHobby, int frequency, List<Address> addresses){
        this.nameOfHobby = nameOfHobby;
        this.frequency = frequency;
        this.addresses = addresses;
    }

    public String getNameOfHobby() {
        return nameOfHobby;
    }

    public int getFrequency() {
        return frequency;
    }

    public List<Address> getAddresses() {
        return addresses;
    }
}
