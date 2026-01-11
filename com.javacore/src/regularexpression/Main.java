package regularexpression;

import org.w3c.dom.ls.LSOutput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String regex="";
        String str="";
    //      String regex="[a-z]";
    //    String str="b";    // true


     //   regex="[a-zA-Z]";
     //   str="0";   //false


      //   regex="[a-zA-Z]";
      //  str="aA";  //false


        // regex="[a-zA-Z]+";
        // str="aaa";

        // RE that accepts alphanumeric character only

         // regex="[0-9a-zA-z]+";
        //str="garima@12"; //false
        // str="adsfgsdg3233"; // true


// RE THAT ACCEPT 10 DIGITS NUMBERS ONLY.
//        regex="[1-9]{10}";
//        str="980879880790";


        // RE THAT MATCHES THE EMAIL ADDRESS

       // regex="^[0-9a-zA-Z@$%._-]+@[0-9a-zA-Z.-]+\\.[a-zA-Z]{2,}$";
       // str="garima@gmail.com";  // true


// RE that contains username having numbers,letters,digits ,@,$
       // regex="[a-zA-Z0-9@$]+";
      //  str="garima";

//        RE that contains vowels
        regex=".*[aeiou]+.*";
        str="garima";


        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(str);
        System.out.println(matcher.matches());




    }

}
