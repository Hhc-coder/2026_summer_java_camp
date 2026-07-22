import java.util.Arrays;

public class Ex07 {
    static void doA(int num){
        System.out.println(num);
        num =100;
    }
    static void doB(int arr[]){
        System.out.println(Arrays.toString(arr));
        arr[0]=200;
    }

    static void main(){
        int a = 10;
        doA(a);
        int bb[] = {10,20,30};
        doB(bb);

        System.out.println("a ="+a);
        System.out.println("bb ="+Arrays.toString(bb));
    }
}
