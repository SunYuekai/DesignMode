package facade.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 下午4:11
 **/
public class LetterProcess implements ILetterProcess {


    @Override
    public void writeContext(String context) {

        System.out.println("邮件内容"+context);
    }

    @Override
    public void fillEnvolope(String address) {

        System.out.println("填写地址"+address);

    }

    @Override
    public void letterIntoEnvelope() {

        System.out.println("塞入信箱");
    }

    @Override
    public void sendLetter() {

        System.out.println("投递邮件");

    }
}
