// write a java program to create a rock-paper-scissors game that users can play with their friends.

import java.util.*;
public class exercise2rockpaperscissor {
    public static void main(String[] args) {
        System.out.println("lets play rock paper scissors");
        Scanner sc=new Scanner(System.in);
        Random ra=new Random();
        System.out.print("enter the number of times you want to play: ");
        int n1=sc.nextInt();
        int a=3;
        int nu=0;
        int nc=0;
        int n2=0;
        while(n2<n1){
            int computer_move=ra.nextInt(a);
            
            System.out.println("computer has chosen now your chance");
            System.out.println("0: rock, 1: paper, 2: scissor");
            int user_move=sc.nextInt();
            if(user_move==0 || user_move==1 || user_move==2){
            if(computer_move==0){
                if(user_move==0){
                    System.out.println("no one gets a point both have chosen rock");;
                }
                else if(user_move==1){
                    System.out.println("computer move: rock");
                    System.out.println("your move: paper");
                    System.out.println("you got one point");
                    nu++;
                
                }
                else {
                    System.out.println("computer move: rock");
                    System.out.println("your move: scissor");
                    System.out.println("computer got one point");
                    nc++;
                }
            }
            if(computer_move==1){
                if(user_move==1){
                    System.out.println("no one gets a point both have chosen paper");;
                }
                else if(user_move==0){
                    System.out.println("computer move: paper");
                    System.out.println("your move: rock");
                    System.out.println("computer got one point");
                    nc++;
                
                }
                else {
                    System.out.println("computer move: paper");
                    System.out.println("your move: scissors");
                    System.out.println("you got one point");
                    nu++;
                }
            }
            if(computer_move==2){
                if(user_move==2){
                    System.out.println("no one gets a point both have chosen scissors");;
                }
                else if(user_move==1){
                    System.out.println("computer move: scissors");
                    System.out.println("your move: paper");
                    System.out.println("computer got one point");
                    nc++;
                
                }
                else {
                    System.out.println("computer move: scissors");
                    System.out.println("your move: rock");
                    System.out.println("you got one point");
                    nu++;
                }
            }
            
            n2++;
        }
        else{
            System.out.println("sorry wrong input.try again");
        }


        }
        if(nu>nc){
            System.out.printf("Congratulation you won by %d runs",(nu-nc));
        }else if(nc>nu){
            System.out.printf("Better luck next time,computer won by %d runs",(nc-nu));
        }
        else{
            System.out.printf("Match tie, both have scored %d runs",nu,nc);
        }

    }
}
