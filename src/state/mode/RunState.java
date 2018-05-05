package state.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-13 ����11:27
 **/
public class RunState extends LiftState {


    @Override
    void open() {


    }

    @Override
    void stop() {

        super.context.setLiftState(Context.STOP_STATE);
        super.context.stop();
    }

    @Override
    void run() {
        System.out.println("������");

    }

    @Override
    void close() {



    }
}
