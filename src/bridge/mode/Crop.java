package bridge.mode;

/**桥梁模式:用于解耦合
 * @author Yuekai.sun
 * @create 2018-04-16 下午12:09
 **/
public  abstract class Crop {


    private Product product;


    public Crop(Product product) {
        this.product = product;
    }



    public  void makeMoney(){


        this.product.beProduced();
        this.product.beSelled();
    }
}
