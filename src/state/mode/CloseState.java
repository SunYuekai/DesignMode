package state.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-13 …œŒÁ11:27
 **/
public class CloseState extends LiftState {


    @Override
    void open() {

        super.context.setLiftState(Context.OPEN_STATE);
        super.context.getLiftState().open();

    }

    @Override
    void stop() {


        super.context.setLiftState(Context.STOP_STATE);
        super.context.getLiftState().stop();

    }

    @Override
    void run() {
        super.context.setLiftState(Context.RUN_STATE);
        super.context.getLiftState().run();


    }

    @Override
    void close() {
        System.out.println("πÿ√≈");
        }
}
