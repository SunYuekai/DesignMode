package factory;

/**
 * @author Yuekai.sun
 * @create 2018-03-29 下午5:25
 **/
public class NvWa {
    public static void main(String[] args) {


        //声明八卦炉
        AbstractHumanFactory YinYangLu = new HumanFactory();
        //白人
        System.out.println("创造白人");
        Human whiteHuman = YinYangLu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        //黑人
        System.out.println("创造黑人");
        Human blackHuman = YinYangLu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        //黄人
        System.out.println("创造黄人");
        Human yellowHuman = YinYangLu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();


    }
}
