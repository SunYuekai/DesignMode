package bridge.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-16 обнГ12:12
 **/
public class Client {


    public static void main(String[] args) {

        Crop houseCrop = new HouseCrop(new House());
        houseCrop.makeMoney();
        Crop prdCrop =  new ProdcutCrop(new Ipod());
        prdCrop.makeMoney();
        Crop prdCrop1 =  new ProdcutCrop(new Clothes());
        prdCrop1.makeMoney();


    }
}
