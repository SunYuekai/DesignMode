package factory.comm_mode;

/**
 * @author Yuekai.sun
 * @create 2018-03-29 обнГ5:45
 **/
public class ConcreteCreator extends Creator {


    @Override
    public <T extends Product> T createProdcut(Class<T> c) {
        Product product = null;
        try {
            product = (Product)Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)product;
    }
}
