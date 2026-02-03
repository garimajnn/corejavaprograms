package immutable.StringImmutable;

public class User {
    public String name;
    public String city;
    public User(String name,String city){
        this.name=name;
        this.city=city;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return name + " "+ city;
    }



    public static void main(String[] args) {
        User user1=new User("garima","indore");
        User user2=new User("garima","sironj");
        System.out.println(user1.getName().hashCode());
        System.out.println(user2.getName().hashCode());
        user1.setName("pooja");
        System.out.println(user1.getName().hashCode());
        System.out.println(user2.getName().hashCode());
        System.out.println(user1);
        System.out.println(user2);

    }
}
