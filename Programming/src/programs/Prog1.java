package programs;

public class Prog1{
public static void main (String [] args)
{
String s = "PR@#$123ogram*>?1MinG";
String s1 = "", s2 = "", s3="", s4="";
for(int i=0; i<s.length(); i++){
 if(s.charAt(i)  == '@' || s.charAt(i) == '#' || s.charAt(i) == '$' || s.charAt(i) == '*' || s.charAt(i)=='>' || s.charAt(i) == '?')
  s1 = s1 + s.charAt(i);
}
for(int i=0; i<s.length();i++){
   if(s.charAt(i) >= 'A' && s.charAt(i)<= 'Z')
   {
        s2 = s2 + s.charAt(i);
   }
}


for(int i=0; i<s.length(); i++){
      if(s.charAt(i) >='a' && s.charAt(i) <='z')
      {
    	  s3 = s3+s.charAt(i);
      }
   }

for (int i=0; i<s.length();i++){
	
}
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
//System.out.println(s4);

}
}