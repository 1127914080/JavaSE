package huan1;
/**
 * @author shkstart
 * @create 2019-02-15 ���� 11:15
 */
/**
 * ʹ��ͬ����������̳�Thread��ķ�ʽ���̰߳�ȫ����
 *
 * ���ӣ���������������Ʊ����Ʊ��Ϊ100��.ʹ�ü̳�Thread��ķ�ʽ
 *
 * ˵�����ڼ̳�Thread�ഴ�����̵߳ķ�ʽ�У�����this�䵱ͬ��������������ʹ�õ�ǰ��䵱ͬ����������
 *
 * @author shkstart
 * @create 2019-02-13 ���� 4:20
 */
class Window2 extends Thread{


    private static int ticket = 100;

    private static Object obj = new Object();

    @Override
    public void run() {

        while(true){
            //��ȷ��
//            synchronized (obj){
            synchronized (Window2.class){//Class clazz = Window2.class,Window2.classֻ�����һ��
                //����ķ�ʽ��this������t1,t2,t3��������
//              synchronized (this){

                if(ticket > 0){

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(getName() + "����Ʊ��Ʊ��Ϊ��" + ticket);
                    ticket--;
                }else{
                    break;
                }
            }

        }

    }
}


public class WindowTest2 {
    public static void main(String[] args) {
        Window2 t1 = new Window2();
        Window2 t2 = new Window2();
        Window2 t3 = new Window2();


        t1.setName("����1");
        t2.setName("����2");
        t3.setName("����3");

        t1.start();
        t2.start();
        t3.start();

    }
}
