package state.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-13 ÉÏÎç11:25
 **/
public class OpenState extends LiftState {


    @Override
    void open() {

        System.out.println("´ò¿ª");

    }

    @Override
    void stop() {
        System.out.println("Do nothing");



    }

    @Override
    void run() {
        System.out.println("Do nothing");

    }

    @Override
    void close() {

        super.context.setLiftState(Context.CLOSE_STATE);
        super.context.getLiftState().close();
    }
}
