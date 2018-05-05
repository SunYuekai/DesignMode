package builder_mode;

import java.util.ArrayList;

/**
 * @author Yuekai.sun
 * @create 2018-03-30 обнГ3:46
 **/
public class BenzCarBuilder extends CarBuilder{


    private CarModel benz = new BenzModel();
    @Override
    protected void setSequence(ArrayList<String> sequence) {
        benz.setSequence(sequence);
    }

    @Override
    protected CarModel getModel() {
        return benz;
    }
}
