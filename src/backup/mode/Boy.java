package backup.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 ����4:56
 **/
public class Boy {

    private String state;






    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //��������
    public Memento createMemento(){


        return new Memento(this.state);

    }

    public void changeState(){

        this.state = "������";
        System.out.println("������");
    }


    //�ָ�����

    public void restoreMemnto(Memento memento){


        this.state = memento.getState();


    }




}
