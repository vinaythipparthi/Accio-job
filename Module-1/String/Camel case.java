https://course.acciojob.com/idle?question=243312c4-baad-471f-8a01-650220d23d4d

Code:

import java.util.*;

class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      String s = sc.next();
      camelCase(s);
      System.out.println(); 
      
    }
  }

  static void camelCase(String s) {
    StringBuilder ans = new StringBuilder("");
    // int j=0;
    // while(j<s.length()){
    //   String word = s.split("_");
    //   ans.append((char)(word.charAt(0)-32));
    //   ans.append(word.substring(1,word.length()+1));
    // }
    boolean flag = true;
    for(int i=0;i<s.length();i++){
      char ch = s.charAt(i);
      if(ch == '_'){
        flag = false;
      }
      if(ch != '_'){
        if(!flag){
          ans.append((char)(s.charAt(i)-32));
          flag = true;
        }else{
          ans.append(ch);
          flag = true;
        }
      }
    }
    System.out.print(ans);
  }
}
