import java.util.Scanner;

public class x {
     public static void gamex(){
      int xcx=3;
      System.out.println("======================");
      System.out.println("====Guessing game=====");
      System.out.println("======================");
      System.out.println("Guess the number chosen by system");
      for(int xc =1;xc<=3;xc++){
      Scanner n =new Scanner(System.in);
      System.out.println("you have" + xcx +"attempts");
      int x=n.nextInt();
      int reference =(int)(Math.random()*100);
      if(x == reference){
      System.out.println("true guessing\n"+"the right number is:"+ reference);
      break;
      }
      else if(x<reference)
      System.out.println("wrong guessing\n"+"the right number is"+ "greater than" +x);
      if(x>reference)
      System.out.println("wrong guessing\n"+"the right number is"+ "lower than" +x);
       if(xc==3)
       System.out.println("the right number was:"+reference);
   xcx--;
   }

}
}