package huan1;

/**
 * ʹ��ͬ���������ʵ��Runnable�ӿڵ��̰߳�ȫ����
 *
 *
 *  ����ͬ���������ܽ᣺
 *  1. ͬ��������Ȼ�漰��ͬ����������ֻ�ǲ���Ҫ������ʽ��������
 *  2. �Ǿ�̬��ͬ��������ͬ���������ǣ�this
 *     ��̬��ͬ��������ͬ���������ǣ���ǰ�౾��
 *
 */


class Window3 implements Runnable {

    private int ticket = 100;

    @Override
    public void run() {
        while (true) {

            show();
        }
    }

    private synchronized void show(){//ͬ����������this
        //synchronized (this){

            if (ticket > 0) {

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + ":��Ʊ��Ʊ��Ϊ��" + ticket);

                ticket--;
            }
        //}
    }
}


public class WindowTest3 {
    public static void main(String[] args) {
        Window3 w = new Window3();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("����1");
        t2.setName("����2");
        t3.setName("����3");

        t1.start();
        t2.start();
        t3.start();
    }

}

