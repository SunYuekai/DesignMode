package bridge.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-16 ÏÂÎç12:11
 **/
public class ProdcutCrop extends  Crop {


    public ProdcutCrop(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("×¬Ð¡Ç®");
    }
}
