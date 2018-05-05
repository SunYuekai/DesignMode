package visitor.mode;

import java.util.Random;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 ����5:29
 **/
public class ObjectStructure {


//    ���������������ɱ��۲�ʵ������
    public static Element createElement(){
        Element ele ;

        Random rand = new Random();

        if(rand.nextInt(50)<25){

             ele = new ConcreteElement2();
        }else {


             ele = new ConcreteElement1();
        }


        return ele;
    }
}
