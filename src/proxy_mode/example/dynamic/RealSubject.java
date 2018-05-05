package proxy_mode.example.dynamic;

/**
 * @author Yuekai.sun
 * @create 2018-04-09 обнГ5:19
 **/
class RealSubject implements Subject
{
    public void doSomething()
    {
        System.out.println( "call doSomething()" );
    }
}
