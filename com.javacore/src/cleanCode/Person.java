package cleanCode;

public class Person {
    int MOD=100000004;

    String personName;
    Person(String personName,Address address){
        this.personName=personName;
        this.address=address;
    }
    Address address;
    public String getCity(){
        return address.city;
    }

    public static void main(String[] args) {
        Address address1=new Address("Indore");
        Person person=new Person("garima",address1);
        person.getCity();
    }


}
