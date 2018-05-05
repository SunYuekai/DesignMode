package backup.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 ÏÂÎç4:56
 **/
public class Memento {


    private String state ;


    public Memento(String state) {


        this.state = state;
    }


    public String getState() {


        return state;
    }


    public void setState(String state) {
        this.state = state;
    }
}



