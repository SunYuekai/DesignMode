package decorator.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 ионГ10:12
 **/
public class ConcreteDecorator1 extends AbtDecorator{



    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void operate() {

        method1();
        method2();
        super.operate();

    }

    private void method2(){


        System.out.println("mothod2 of 1");
    }

    private void method1(){


        System.out.println("mothod1 of 1 ");
    }
}
