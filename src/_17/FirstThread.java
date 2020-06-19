package _17;

public class FirstThread extends Thread{
    private int i;
    public void run() {
        for (; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        FirstThread ft = new FirstThread();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "  " + i);
            if (i == 5) {
                ft.start();
                System.out.println(ft.isAlive());
            }
            if (i > 5 && !ft.isAlive()) {
                System.out.println("开始了");
                ft.start();
            }
        }
    }
}
