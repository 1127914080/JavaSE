package huan1;

/**
 * ʹ��ͬ����������̳�Thread��ķ�ʽ�е��̰߳�ȫ����
 *
 * @author shkstart
 * @create 2019-02-15 ���� 11:43
 */
class Window4 extends Thread {


    private static int ticket = 100;

    @Override
    public void run() {

        while (true) {

            show();
        }

    }
    private static synchronized void show(){//ͬ����������Window4.class
        //private synchronized void show(){ //ͬ����������t1,t2,t3�����ֽ����ʽ�Ǵ����
        if (ticket > 0) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "����Ʊ��Ʊ��Ϊ��" + ticket);
            ticket--;
        }
    }
}


public class WindowTest4 {
    public static void main(String[] args) {
        Window4 t1 = new Window4();
        Window4 t2 = new Window4();
        Window4 t3 = new Window4();


        t1.setName("����1");
        t2.setName("����2");
        t3.setName("����3");

        t1.start();
        t2.start();
        t3.start();

    }
}