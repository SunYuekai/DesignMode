package decorator.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 ����10:12
 **/
public class ConcreteDecorator2 extends AbtDecorator {


    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void operate() {

        method1();
        method2();
        super.operate();

    }

    private void method2(){


        System.out.println("mothod2 of 2");
    }

    private void method1(){


        System.out.println("mothod1 of 2 ");
    }










}
