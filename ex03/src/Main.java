void main(){
    String aa = "abc";
    String bb = aa;

    String cc = new String("abcdef");
    String dd = new String("abcdef");

    System.out.println("aa == bb "+(aa==bb));
    System.out.println("cc == dd "+(cc==dd));
    System.out.println("cc == dd "+(cc.equals(dd)));
}