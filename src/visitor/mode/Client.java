package visitor.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 ����5:29
 **/
public class Client {


    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {


            Element ele = ObjectStructure.createElement();

            //���ܷ����߷���
            Ivisitor visitor = new ConcreteVisitor();

            ele.accept(visitor);

        }






    }
}
