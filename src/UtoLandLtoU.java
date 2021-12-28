import java.beans.FeatureDescriptor;
import java.util.Arrays;
import java.util.Scanner;

public class UtoLandLtoU {

//    public static String CaseChange(String Name){
//        char[] arr = new char[Name.length()];
//        String finalString = "";
//        for(int i=0; i<Name.length();i++){
//            arr[i] = Name.charAt(i);
//            char upper =Character.toUpperCase(arr[i]);
//            if(arr[i]== upper){
//                finalString = finalString+ Character.toLowerCase(arr[i]);
//            }
//            else{
//                finalString = finalString + upper;
//            }
//        }
//        String finalString = "";
//        for(int i=0; i<arr.length;i++){
//            char upper =Character.toUpperCase(arr[i]);
//            if(arr[i]== upper){
//                finalString = finalString+ Character.toLowerCase(arr[i]);
//            }
//            else{
//                finalString = finalString + upper;
//            }
//        }
//        return finalString;
//        }

//    public static int Fibonacci(int a){
//        if (a==0){
//            return a;
//        }
//        int start = 0;
//        int stop = 1;
//        int result = 0;
//        for(int i=1; i<a; i++){
//            result = start + stop;
//            start = stop;
//            stop = result;
//        }
//        return result;
//    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        String name = input.nextLine();
//        System.out.println(CaseChange(name));
//        int a = input.nextInt();
//        System.out.println(Fibonacci(a));
//        int l = input.nextInt();
//        int[] arr = new int[l];
//        int k = input.nextInt();
//        int result = 1;
//        for(int i=0; i<l; i++){
//            arr[i] = input.nextInt();
//            if (arr[i] == k){
//                result = result + k;
//                System.out.println(i);
//                break;
//            }
//        }
//        if(result == 1){
//            System.out.println(-1);
//        }
        int l= input.nextInt();
        String listnew = input.nextLine();
        char[] arr = listnew.toCharArray();
        System.out.println(Arrays.toString(arr));


    }
}
