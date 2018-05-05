package factory.comm_mode;

/**
 * 抽象产品:相当于Human接口 可抽象出公共方法和需重写的抽象方法
 * @author Yuekai.sun
 * @create 2018-03-29 下午5:33
 **/
public abstract  class Product {

    //产品公共方法
    public void commMethod(){
        System.out.println("公共步骤");
    }
    //抽象子类需特征化方法
    public abstract  void speMethod();

}
