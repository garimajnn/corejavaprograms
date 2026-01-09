package deepvsshallow;

public class Address implements Cloneable {
    private String city;
    private String street;
    private String state;

    public Address(String street,String city,String state){
        this.city=city;
        this.state=state;
        this.street=street;
    }
    protected Object clone() throws CloneNotSupportedException{
        return (Address) super.clone();
    }
}
