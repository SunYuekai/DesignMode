package factory.comm_mode;

/**
 * @author Yuekai.sun
 * @create 2018-03-29 обнГ5:50
 **/
public class Client {


    public static void main(String[] args) {

        Creator creator = new ConcreteCreator();
        Product product = creator.createProdcut(ConcreteProduct1.class);
        product.commMethod();
        product.speMethod();



    }
}
