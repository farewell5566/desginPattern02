public class Instance03 {

    private static Instance03 instance;

    private Instance03(){}

    public static Instance03 getInstance() {
        if (instance ==null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new Instance03();
        }
        return instance;
    }

    public static void thread01(){
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {


                @Override
                public void run() {
                    System.out.println(Instance03.getInstance().hashCode());
                }
            }).start();
        }
    }

    public static void thread02(){
        for (int i = 0; i < 100; i++) {
            new Thread(()->
                    System.out.println(Instance03.getInstance().hashCode())).start();
        }
    }

    public static void main(String[] args) {
        thread01();
    }
}
