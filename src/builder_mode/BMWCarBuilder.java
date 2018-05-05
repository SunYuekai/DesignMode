package builder_mode;

import java.util.ArrayList;

/**
 * @author Yuekai.sun
 * @create 2018-03-30 обнГ3:46
 **/
public class BMWCarBuilder extends CarBuilder{


    private CarModel bmw = new BMWModel();


    @Override
    protected void setSequence(ArrayList<String> sequence) {
        bmw.setSequence(sequence);
    }

    @Override
    protected CarModel getModel() {
        return bmw;
    }
}
