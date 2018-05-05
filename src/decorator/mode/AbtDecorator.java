package decorator.mode;

/**����װ����
 * @author Yuekai.sun
 * @create 2018-04-12 ����10:10
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
