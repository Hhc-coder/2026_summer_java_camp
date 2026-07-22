import java.util.Arrays;

public class Ex06 {
    static void main(String[] args){
        int arr[] = new int[10];
        int brr[] = arr;

        arr[0] = 100;

        //cmd + d 한줄복사
        //cmd + shift + -> 영역지정
        //cmd + shift 화살표 밑으로 라인이동
        System.out.println("arr"+ Arrays.toString(arr));
        System.out.println("brr"+ Arrays.toString(brr));

    }
}
