package basics;

import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        int temp=56;
        if(temp>=40){
            System.out.println("High temperature");
        }

        int a=5,b=6;
        if(a>b){
            System.out.println("a is greater");
        }else{
            System.out.println("b is greater");
        }
        System.out.println(10>5); //true

        System.out.println(a>b?"a is greater":"b is greater");

        String color;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter color char:");
        color= sc.nextLine();
        switch (color){
            case "r":
                System.out.println("red color");
                break;
            case "g":
                System.out.println("green color");
                break;
            case "b":
                System.out.println("blue color");
                break;
            default:
                System.out.println("not rgb color");
                break;
        }

    }
}
