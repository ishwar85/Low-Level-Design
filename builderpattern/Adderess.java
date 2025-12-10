package builderpattern;

public class Adderess {
    private String pinCode;
    private String city;
    private String state;
    private String newrBy;

    public String getPinCode() {
        return pinCode;
    }



    public String getCity() {
        return city;
    }



    public String getState() {
        return state;
    }



    public String getNewrBy() {
        return newrBy;
    }


    public Adderess(String pinCode, String city, String state, String newrBy) {
        this.pinCode = pinCode;
        this.city = city;
        this.state = state;
        this.newrBy = newrBy;
    }
}
