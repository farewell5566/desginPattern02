public class Instance02 {

    private static Instance02 Instance;
    private  Instance02(){};
    static {
        Instance =new Instance02();
    }

    public static Instance02 getInstance(){return  Instance;}


    public static void main(String[] args) {
        Instance02 ins01 = Instance02.getInstance();
        Instance02 ins02 = Instance02.getInstance();
        System.out.println(ins01 == ins02);
    }
}
