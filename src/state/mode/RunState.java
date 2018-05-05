package state.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-13 上午11:27
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
        System.out.println("运行中");

    }

    @Override
    void close() {



    }
}
