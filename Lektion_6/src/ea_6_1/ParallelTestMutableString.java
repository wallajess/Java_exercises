package ea_6_1;

public class ParallelTestMutableString {

    public static void main(String[] args) {
        MutableString shared = new MutableString("Start");

        Runnable appenderA = () -> {
            for (int i = 0; i < 100; i++) {
                shared.append("A");
            }
        };

        Runnable appenderB = () -> {
            for (int i = 0; i < 100; i++) {
                shared.append("B");
            }
        };

        Runnable appenderC = () -> {
            for (int i = 0; i < 100; i++) {
                shared.append("C");
            }
        };

        Thread t1 = new Thread(appenderA);
        Thread t2 = new Thread(appenderB);
        Thread t3 = new Thread(appenderC);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final string: " + shared.toString());
        System.out.println("Final length: " + shared.length());
    }
}

