package visitor.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 обнГ5:25
 **/


    public class ConcreteElement2  extends  Element {


        @Override
        void doSomething() {
            System.out.println("ele2");
        }

        @Override
        void accept(Ivisitor visitor) {

            visitor.visit(this);
        }


    }

