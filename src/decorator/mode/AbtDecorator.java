package decorator.mode;

/**抽象装饰类
 * @author Yuekai.sun
 * @create 2018-04-12 上午10:10
 **/
public abstract class AbtDecorator implements  Component{





    private Component component = null;


    public AbtDecorator(Component component) {



        this.component = component;
    }

    @Override
    public void operate() {

        this.component.operate();

    }
}
