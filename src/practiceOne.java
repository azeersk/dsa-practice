import java.util.Arrays;
import java.util.Scanner;

public class practiceOne {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        int first = input.nextInt();
//        int second = input.nextInt();
//        String addition = "+";
//        String subtraction = "-";
//        String multiplication = "*";
//        String division = "/";
//        String calculate = input.next();
//        if(calculate.equals(addition)){
//            System.out.println(first + second);
//        }
//        else if(calculate.equals(subtraction)){
//            System.out.println(first - second);
//        }
//        else if(calculate.equals(multiplication)){
//            System.out.println(first * second);
//        }
//        else if(calculate.equals(division)){
//            System.out.println(first / second);
//        }
//        int a = input.nextInt();
//        for(int i=0; i<=a ; i++){
//            System.out.println("* ".repeat(i)+"  ".repeat(a-i)+"  ".repeat(a-i)+"* ".repeat(i));
//        }
//        for(int j=0; j<=a; j++){
//            System.out.println("* ".repeat(a-j)+"  ".repeat(j)+"  ".repeat(j)+"* ".repeat(a-j));
//        }

//        int a = input.nextInt();
//        String[] name = new String[a];
//        for(int i=0; i<=a; i++){
//            name[i] = input.nextLine();
//            System.out.println(Arrays.toString(name));
//        }
//        int[] numbers = {1,2,3,4,5,6,7};
//        for(int i=0; i<numbers.length; i++){
//            System.out.println(numbers[i]);
//        }

//        int [] numbers = {23, 34, 45, 56, 67, 78};
//        int [] numbersTwo =  {23, 34, 45, 56, 67, 78};
//        int [] result = new int[numbers.length];
//        for(int i=0; i<6; i++){
//           result[i] =  numbers[i] + numbersTwo[i];
//        }
//        System.out.println(Arrays.toString(result));
//
//        int a = input.nextInt();
//        System.out.println(Math.round(Math.random()));

//        int a = input.nextInt();
//        String age;
//        switch(a){
//            case 17:
//                age = "17 your not eligible for vote!";
//                break;
//            case 19:
//                age = "19 your eligible for vote!";
//                break;
//            default:
//                age = "not recognizing!";
//        }
//        System.out.println("age : "+ age);
        String a = input.nextLine();
        String massage;
        switch (a){
            case "a":
                massage = "a grade is your score is too great!";
                break;
            case "b":
                massage = "b grade is your score is to good!";
                break;
            case "c":
                massage = "c grade is your score is good!";
                break;
            case "d":
                massage = "d grade is your score is average!";
                break;

            default:
                massage = "Fail!";

        }
        System.out.println(massage);
  }
}
