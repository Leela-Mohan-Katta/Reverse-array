import java.util.Scanner;

public class reverseusingextraarray {
    public static void main(String[] args) {
        /*
        Using two arrays a simple approach of reversing the array, taking a temp array and adding the elements in
        reverse order to the temp array will make the reversed array.
         */

        int[] arr1 = new int[3];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<3;i++){
            arr1[i]=scan.nextInt();
        }
        int[] arr2= new int[3];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[arr1.length - i - 1];
        }
        for(int i=0;i<3;i++){
            System.out.println(arr2[i]);
        }


    }
}
