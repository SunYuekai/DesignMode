package bridge.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-16 ����12:11
 **/
public class HouseCrop extends  Crop {


    public HouseCrop(House house) {
        super(house);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();

        System.out.println("���ز�׬��Ǯ");
    }
}
