import java.util.Arrays;

public class Ex05 {
    static void main(){
        int arr[][] = new int[3][2];
        doPrint(arr);
    }

    public static void doPrint(int brr[][]){
        System.out.println("doPrint");
        for (int i = 0; i < brr.length; i++) {
            System.out.println(Arrays.toString(brr[i]));
        }
    }
}
