package decorator.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 ионГ10:16
 **/
public class Client {


    public static void main(String[] args) {
        Component component= new ConcreteComponent();


        Component decorator1 = new ConcreteDecorator1(component);
        Component decorator2 = new ConcreteDecorator2(decorator1);

        decorator2.operate();



    }
}
