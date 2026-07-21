import java.util.Arrays;

public class Ex04 {
    static void main(String[] args){
        int arr[] = new int[5];

        arr[0] = 10;
        System.out.println(Arrays.toString(arr));
//        arr[5] = 20;
        for (int i = 0; i < 5; i++) {
            System.out.println("arr[i]="+arr[i]);
        }
    }
}