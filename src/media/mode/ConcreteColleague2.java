package media.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-10 下午3:10
 **/
public class ConcreteColleague2 {


    private Mediator mediator;

    public ConcreteColleague2(Mediator mediator) {
        this.mediator = mediator;
    }



    //业务方法1

    public void method1(){


        System.out.println("method1");
    }
    //业务方法2
    public void method2(){


        System.out.println("method2");
    }
    public void depMethod(){

        mediator.doSomething1();
    }

}
