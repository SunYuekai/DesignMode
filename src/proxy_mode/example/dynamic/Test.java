package proxy_mode.example.dynamic;

/**
 * @author Yuekai.sun
 * @create 2018-04-09 下午5:21
 **/
public class Test
{
    public static void main(String args[])
    {
        Handler proxy = new Handler();
        //绑定该类实现的所有接口
        Subject sub = (Subject) proxy.bind(new RealSubject());
        sub.doSomething();
    }
}