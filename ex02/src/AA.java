public class AA {
    public void doA(){
        for (int i = 1; i < 10; i++) {
            System.out.println("--"+i+"단"+"--");
            for (int j = 1; j < 10; j++) {
                System.out.println("| "+i+"*"+j+"="+(i*j)+" |");
            }
            System.out.println();
        }
    }
    public void doB(){
        int num = 10;
        switch (num){
            case 10:
                System.out.println("10입니다");
                break;
            default:
                System.out.println("기본");
        }
    }
}
