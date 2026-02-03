package streamspractise.task1;

import java.util.Random;

public class Password {
    String password;
   public String generatePassword(){
       String allChars="ABCDEF13213234565787989090POIUYTREWQASDFGHJLMNBVCCZ";
       Random random=new Random();
       int mini=10;
       int maxi=20;
       int passwordlength = random.nextInt(maxi-mini+1)+mini;
       StringBuilder sb=new StringBuilder("");
       for(int i=0;i<passwordlength;i++){
           char ch=allChars.charAt(random.nextInt(allChars.length()));
           sb.append(ch);
       }
       return sb.toString();


   }

}
