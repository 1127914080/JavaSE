package huan2;

/**
 *
 * ���ӣ���������������Ʊ����Ʊ��Ϊ100��.ʹ�ü̳�Thread��ķ�ʽ
 *
 * �����̵߳İ�ȫ���⣬�������
 *
 *
 */
class Window extends Thread{


    private static int ticket = 100;
    @Override
    public void run() {

        while(true){

            if(ticket > 0){
                System.out.println(getName() + "����Ʊ��Ʊ��Ϊ��" + ticket);
                ticket--;
            }else{
                break;
            }

        }

    }
}


public class WindowTest {
    public static void main(String[] args) {
        Window t1 = new Window();
        Window t2 = new Window();
        Window t3 = new Window();


        t1.setName("����1");
        t2.setName("����2");
        t3.setName("����3");

        t1.start();
        t2.start();
        t3.start();

    }
}
