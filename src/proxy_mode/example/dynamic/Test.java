package proxy_mode.example.dynamic;

/**
 * @author Yuekai.sun
 * @create 2018-04-09 ����5:21
 **/
public class Test
{
    public static void main(String args[])
    {
        Handler proxy = new Handler();
        //�󶨸���ʵ�ֵ����нӿ�
        Subject sub = (Subject) proxy.bind(new RealSubject());
        sub.doSomething();
    }
}