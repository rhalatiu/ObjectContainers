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
}
