package bridge.mode;

/**����ģʽ:���ڽ����
 * @author Yuekai.sun
 * @create 2018-04-16 ����12:09
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
