package command.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-10 обнГ3:40
 **/
public class Invoker {


    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }


    public void action(){


        this.command.execute();
    }
}
