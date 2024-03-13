package Prg4;
import javax.lang.model.SourceVersion;
import java.util.*;

public class ArrayProg {
    public static void main(String[] args) {
        int size = 5,sum = 0;
        int[] arr = new int[size];
        //Block To check for ArrayIndexOutOfBounds exception
        try {
            //Block To check for Dividing By Zero Exception
            try {
                System.out.println("Enter Array[5] elements :");
                Scanner sc = new Scanner(System.in);
                for (int i = 0; i < size; i++) {
                    System.out.print(">> ");
                    arr[i] = sc.nextInt();
                }
                sum = sum + arr[0];
                for (int i = 1; i < size; i++) {
                    sum = sum + arr[i] / (arr[i] - arr[0]);
                }
            } catch (ArithmeticException e) {
                System.out.println("Dividing by zero ");
            }
            for(int i = 0;i<size; i++){
                System.out.println(arr[arr[i]]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of Bounds.");
        }

    }
}
