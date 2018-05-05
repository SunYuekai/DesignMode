package visitor.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 ÏÂÎç5:26
 **/
public class ConcreteVisitor implements Ivisitor {


    @Override
    public void visit(ConcreteElement1 ele1) {


        System.out.println("¹Û²ìele1");
    }

    @Override
    public void visit(ConcreteElement2 ele2) {

        System.out.println("¹Û²ìele2");



    }
}
