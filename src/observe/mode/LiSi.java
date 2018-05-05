package observe.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 下午3:54
 **/
public class LiSi extends Observer {


    @Override
    void update(String context) {

        report(context);

    }

    private void report(String context){


        System.out.println("李斯报告"+context);
    }
}
