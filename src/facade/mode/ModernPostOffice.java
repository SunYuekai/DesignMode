package facade.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 下午4:07
 **/
public class ModernPostOffice {


    private  ILetterProcess letterProcess = new LetterProcess();

    private LetterCheck  letterCheck = new LetterCheck();


    public void sendLetter(String context,String address){
//        封装内容
        letterProcess.writeContext(context);
//      填写地址
        letterProcess.fillEnvolope(address);
//       塞入邮箱
        letterProcess.letterIntoEnvelope();
//        核对邮件
        letterCheck.checkLetter(letterProcess);
//         发送邮件
        letterProcess.sendLetter();


    }
}
