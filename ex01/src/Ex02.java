public class Ex02 {
    public static void main(String[] args) {
        System.out.println("자바는 21버전 이후에는 public 이 없어도 됩니다");
        String input = IO.readln();
        System.out.println("input = "+input);
        Test test = new Test();
        test.doA();
        System.out.println("main종료");
    }
}
