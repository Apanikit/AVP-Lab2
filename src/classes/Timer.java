package classes;
public class Timer extends Thread{
    private final MyDelegate func;
    private final long interval;

    public Timer(MyDelegate lambda, long time) {
        func = lambda;
        interval = time;
    }
    public void run() {
        try {
            Thread.sleep(interval); // Пусть таймер работает 5 секунд
            func.apply();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

/*
    public static void start(MyDelegate func, long interval) {
        try {
            Thread.sleep(interval); // Пусть таймер работает 5 секунд
            func.apply();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

 */
}
