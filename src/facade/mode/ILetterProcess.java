package facade.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 обнГ4:11
 **/
public interface ILetterProcess {


    void writeContext(String context);

    void fillEnvolope(String address);

    void letterIntoEnvelope();

    void sendLetter();






}
