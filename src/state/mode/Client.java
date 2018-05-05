package state.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-13 ионГ11:57
 **/
public class Client
{


    public static void main(String[] args) {

        Context context = new Context(new CloseState());
        context.open();
        context.close();
        context.run();
        context.stop();



    }
}
