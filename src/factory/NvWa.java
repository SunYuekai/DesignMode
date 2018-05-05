package factory;

/**
 * @author Yuekai.sun
 * @create 2018-03-29 ����5:25
 **/
public class NvWa {
    public static void main(String[] args) {


        //��������¯
        AbstractHumanFactory YinYangLu = new HumanFactory();
        //����
        System.out.println("�������");
        Human whiteHuman = YinYangLu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        //����
        System.out.println("�������");
        Human blackHuman = YinYangLu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        //����
        System.out.println("�������");
        Human yellowHuman = YinYangLu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();


    }
}
