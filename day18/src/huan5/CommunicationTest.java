package huan5;

/**
 * �߳�ͨ�ŵ����ӣ�ʹ�������̴߳�ӡ 1-100���߳�1, �߳�2 �����ӡ
 *
 * �漰��������������
 * wait():һ��ִ�д˷�������ǰ�߳̾ͽ�������״̬�����ͷ�ͬ����������
 * notify():һ��ִ�д˷������ͻỽ�ѱ�wait��һ���̡߳�����ж���̱߳�wait���ͻ������ȼ��ߵ��Ǹ���
 * notifyAll():һ��ִ�д˷������ͻỽ�����б�wait���̡߳�
 *
 * ˵����
 * 1.wait()��notify()��notifyAll()������������ʹ����ͬ��������ͬ�������С�
 * 2.wait()��notify()��notifyAll()���������ĵ����߱�����ͬ��������ͬ�������е�ͬ����������
 *    ���򣬻����IllegalMonitorStateException�쳣
 * 3.wait()��notify()��notifyAll()���������Ƕ�����java.lang.Object���С�
 *
 * �����⣺sleep() �� wait()����ͬ��
 * 1.��ͬ�㣺һ��ִ�з�����������ʹ�õ�ǰ���߳̽�������״̬��
 * 2.��ͬ�㣺1����������������λ�ò�ͬ��Thread��������sleep() , Object��������wait()
 *          2�����õ�Ҫ��ͬ��sleep()�������κ���Ҫ�ĳ����µ��á� wait()����ʹ����ͬ��������ͬ��������
 *          3�������Ƿ��ͷ�ͬ�����������������������ʹ����ͬ��������ͬ�������У�sleep()�����ͷ�����wait()���ͷ�����
 *
 */
class Number implements Runnable{
    private int number = 1;
    private Object obj = new Object();
    @Override
    public void run() {

        while(true){

            synchronized (obj) {

                obj.notify();

                if(number <= 100){

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;

                    try {
                        //ʹ�õ�������wait()�������߳̽�������״̬
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }else{
                    break;
                }
            }

        }

    }
}


public class CommunicationTest {
    public static void main(String[] args) {
        Number number = new Number();
        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);

        t1.setName("�߳�1");
        t2.setName("�߳�2");

        t1.start();
        t2.start();
    }
}
