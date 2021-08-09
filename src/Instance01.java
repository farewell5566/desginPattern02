public class Instance01 {

    private static Instance01 instance = new Instance01();

    private Instance01(){}

    public static Instance01 getInstance(){
        return instance;
    }


    public static void main(String[] args) {
        Instance01 ins01 = Instance01.getInstance();
        Instance01 ins02 = Instance01.getInstance();
        System.out.println(ins01 == ins02);
        for (int i = 0; i < 100; i++) {
            System.out.println(Instance01.getInstance());
        }
    }
}
