public class EvenOddThreads {
    public static void main(String args[]) {
        Thread evenThread = new Thread(new EvenRunnable());
        Thread oddThread = new Thread(new OddRunnable());
        evenThread.start();
        oddThread.start();
    }
}

class EvenRunnable implements Runnable {
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even Thread: " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class OddRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 9; i += 2) {
            System.out.println("Odd Thread: " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
