package HomeWork5;

public class Main {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;
    private Object lock1 = new Object();

    public static void main(String[] args) {
        Main o = new Main();

        o.method1();
        o.method2();
    }

    public void method1() {
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        calculate(arr);


        System.out.println(System.currentTimeMillis() - a);
    }


    public void method2() {
        float[] arr = new float[SIZE];
        float[] a1 = new float[HALF];
        float[] a2 = new float[HALF];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, a1, 0, HALF);
        System.arraycopy(arr, HALF, a2, 0, HALF);

        new Thread() {
            @Override
            public void run() {
                calculate(a1);
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                calculate(a2);
            }
        }.start();

        System.arraycopy(a1,0,arr,0,HALF);
        System.arraycopy(a2,0,arr,HALF,HALF);

        System.out.println(System.currentTimeMillis() - a);
    }

    public float[] calculate(float arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        return arr;
    }

}