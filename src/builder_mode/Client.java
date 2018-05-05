package builder_mode;

import java.util.ArrayList;

/**
 *
 * @author Yuekai.sun
 * @create 2018-03-30 обнГ3:25
 **/
public class Client {


    public static void main(String[] args) {

        Director director = new Director();
        director.getBenzA().run();
        director.getBenzB().run();
        director.getBMWA().run();
        director.getBMWB().run();
    }
}
