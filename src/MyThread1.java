import java.util.Random;

public class MyThread1 implements Runnable {
    public static void main(String[] args) {
        MyThread1 th = new MyThread1();
        Thread t1 = new Thread(th);
        t1.start();
    }

    @Override
    public void run() {
        Random random = new Random();
        String colours[] = {"white", "blue", "black", "green", "red", "yellow"};
        int index;

        while ((index = random.nextInt(6)) != 4) {
            System.out.println(colours[index]);
        }
    }
}
