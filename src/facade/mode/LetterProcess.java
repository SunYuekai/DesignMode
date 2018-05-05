package facade.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 ����4:11
 **/
public class LetterProcess implements ILetterProcess {


    @Override
    public void writeContext(String context) {

        System.out.println("�ʼ�����"+context);
    }

    @Override
    public void fillEnvolope(String address) {

        System.out.println("��д��ַ"+address);

    }

    @Override
    public void letterIntoEnvelope() {

        System.out.println("��������");
    }

    @Override
    public void sendLetter() {

        System.out.println("Ͷ���ʼ�");

    }
}
