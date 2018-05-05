package facade.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 ����4:07
 **/
public class ModernPostOffice {


    private  ILetterProcess letterProcess = new LetterProcess();

    private LetterCheck  letterCheck = new LetterCheck();


    public void sendLetter(String context,String address){
//        ��װ����
        letterProcess.writeContext(context);
//      ��д��ַ
        letterProcess.fillEnvolope(address);
//       ��������
        letterProcess.letterIntoEnvelope();
//        �˶��ʼ�
        letterCheck.checkLetter(letterProcess);
//         �����ʼ�
        letterProcess.sendLetter();


    }
}
