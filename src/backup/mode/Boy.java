package backup.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 下午4:56
 **/
public class Boy {

    private String state;






    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //创建备份
    public Memento createMemento(){


        return new Memento(this.state);

    }

    public void changeState(){

        this.state = "心情变差";
        System.out.println("心情变差");
    }


    //恢复备份

    public void restoreMemnto(Memento memento){


        this.state = memento.getState();


    }




}
