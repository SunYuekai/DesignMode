package media.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-10 ����3:09
 **/
public class ConcreteColleague1 {

    private Mediator mediator;

    public ConcreteColleague1(Mediator mediator) {
        this.mediator = mediator;
    }


    //ҵ�񷽷�1

    public void method1(){


        System.out.println("method1");
    }
    //ҵ�񷽷�2
    public void method2(){


        System.out.println("method2");
    }
    //�����н��ߵ�ҵ�񷽷�
    public void depMethod(){

        mediator.doSomething1();
    }


}
