public class Ex01 {
    static void main(String[] args){
        String a = "java";
        String b = "java";
        String c = new String("java");

        System.out.println("a ="+ a);
        System.out.println("b ="+ b);
        System.out.println("c ="+ c);

        System.out.println(a==b);
        System.out.println(a==c);

        System.out.println(a.equals(c));
    }
}