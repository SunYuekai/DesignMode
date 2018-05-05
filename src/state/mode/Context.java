package state.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-13 ÉÏÎç11:23
 **/
public class Context {



    public static final OpenState OPEN_STATE = new OpenState();
    public static final CloseState CLOSE_STATE = new CloseState();
    public static final RunState RUN_STATE = new RunState();
    public static final StopState STOP_STATE = new StopState();

    private LiftState liftState ;

    public Context(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.context  = this ;

    }


    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.context  = this ;
    }


    public void open(){

        this.liftState.open();
    }

    public void close(){
        this.liftState.close();

    }

    public void stop(){
        this.liftState.stop();

    }

    public void run(){

        this.liftState.run();
    }




}
