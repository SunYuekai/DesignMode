package backup.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 ����5:01
 **/
public class Client {


    public static void main(String[] args) {



        Boy boy = new Boy();
        boy.setState("���鲻��");
        System.out.println(boy.getState());
        Cracker cracker = new Cracker(boy.createMemento());
        boy.changeState();
        boy.restoreMemnto(cracker.getMemento());
        System.out.println(boy.getState());

    }
}
