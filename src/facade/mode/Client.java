package facade.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 ����4:18
 **/
public class Client {


    public static void main(String[] args) {



        ModernPostOffice letter = new ModernPostOffice();

        letter.sendLetter("����","����");

    }

}
