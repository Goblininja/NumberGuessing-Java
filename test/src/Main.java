import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       int min = 1;
       int max;
       int guess;
       int k = 5;
       int i = 1;


       System.out.println("choose an upperbound number: "); 
       max = scan.nextInt();

       int b = (int)(Math.random()*(max-min+1)+min);

       System.out.println("guess a number between "+min+" and "+max+": ");
       guess = scan.nextInt();

       for(; i < k; i++) {
           if(guess == b) {
               System.out.println("you guessed the number correct!");
               break;
           }
           else if(guess < b) {
               System.out.println("guess higher: ");
               guess = scan.nextInt();
               if(guess == b){
                   i++;
                   System.out.println("correct took you "+ i +" tries");
                   break;
               }
           }
           else if(guess > b) {
               System.out.println("guess lower: ");
               guess = scan.nextInt();
               if(guess == b){
                   i++;
                   System.out.println("correct took you "+ i +" tries");
                   break;
               }
           }
       }
       if(i == k) {
           System.out.println("you have run out of tries");
           System.out.println("the answer was "+b);
       }
    }
}