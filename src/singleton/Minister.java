package singleton;

/**
 * @author Yuekai.sun
 * @create 2018-03-29 ÏÂÎç4:18
 **/
public class Minister {


    public static void main(String[] args) {

        for(int day = 0;day<3;day++){

            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }
    }
}
