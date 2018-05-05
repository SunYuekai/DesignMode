package state.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-13 ÉÏÎç11:27
 **/
public class StopState extends LiftState {


    @Override
    void open() {

        super.context.setLiftState(Context.OPEN_STATE);
        super.context.getLiftState().open();
    }

    @Override
    void stop() {
        System.out.println("Í£Ö¹");
    }

    @Override
    void run() {
        super.context.setLiftState(Context.RUN_STATE);
        super.context.getLiftState().run();

    }

    @Override
    void close() {
        System.out.println("Do nothing");
    }
}
