package huan2;

/**
 * ʹ��enum�ؼ��ֶ���ö����
 * ˵���������ö����Ĭ�ϼ̳���java.lang.Enum��
 *
 * @author shkstart
 * @create 2019 ���� 10:35
 */
public class SeasonTest1 {
    public static void main(String[] args) {
        Season1 summer = Season1.SUMMER;
        //toString():����ö������������
        System.out.println(summer.toString());

//        System.out.println(Season1.class.getSuperclass());
        System.out.println("****************");
        //values():�������е�ö������󹹳ɵ�����
        Season1[] values = Season1.values();
        for(int i = 0;i < values.length;i++){
            System.out.println(values[i]);
            values[i].show();
        }
        System.out.println("****************");
        Thread.State[] values1 = Thread.State.values();
        for (int i = 0; i < values1.length; i++) {
            System.out.println(values1[i]);
        }

        //valueOf(String objName):����ö�����ж�������objName�Ķ���
        Season1 winter = Season1.valueOf("WINTER");
        //���û��objName��ö������������쳣��IllegalArgumentException
//        Season1 winter = Season1.valueOf("WINTER1");
        System.out.println(winter);
        winter.show();
    }
}

interface Info{
    void show();
}

//ʹ��enum�ؼ���ö����
enum Season1 implements Info{
    //1.�ṩ��ǰö����Ķ��󣬶������֮����","������ĩβ����";"����
    SPRING("����","��ů����"){
        @Override
        public void show() {
            System.out.println("���������");
        }
    },
    SUMMER("����","��������"){
        @Override
        public void show() {
            System.out.println("����");
        }
    },
    AUTUMN("����","�����ˬ"){
        @Override
        public void show() {
            System.out.println("���첻����");
        }
    },
    WINTER("����","����ѩ��"){
        @Override
        public void show() {
            System.out.println("��Լ�ڶ���");
        }
    };

    //2.����Season���������:private final����
    private final String seasonName;
    private final String seasonDesc;

    //2.˽�л���Ĺ�����,�����������Ը�ֵ

    private Season1(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //4.��������1����ȡö������������
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
//    //4.��������1���ṩtoString()
//
//    @Override
//    public String toString() {
//        return "Season1{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDesc='" + seasonDesc + '\'' +
//                '}';
//    }


//    @Override
//    public void show() {
//        System.out.println("����һ������");
//    }
}
