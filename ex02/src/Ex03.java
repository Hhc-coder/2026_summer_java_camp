public class Ex03 {
    static void main(String[] args) {
        int i = 1;
        while (i < 11){
            if (i == 5) {
                i++;
                continue;
            }
            if(i==9)break;
            System.out.println(i);
            i++;
        }
    }
}
