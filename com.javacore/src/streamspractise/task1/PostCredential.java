package streamspractise.task1;

import immutable.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class UserName{
    private final String userName;
    public UserName(String userName){
       this.userName=userName;

    }

    public String getUserName() {
        return userName;
    }


}

public class PostCredential {
    private List<UserName>userNameList;
    public PostCredential(){
        userNameList=new ArrayList<>();
    }
    public List<UserName> createListOfUserNames(List<Student> studentList){
        HashSet<String>set=new HashSet<>();
        for(Student student:studentList){

          String username=student.getFirstName()+" "+student.getLastName();
          if(!(set.contains(username))){
              UserName name=new UserName(username);
              userNameList.add(name);
              System.out.println(name.getUserName());
              set.add(username);
          }
         else{
              System.out.println("USername already exists!");
          }
        }
         return userNameList;
    }
}
