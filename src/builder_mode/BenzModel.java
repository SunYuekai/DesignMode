package builder_mode;

/**
 * @author Yuekai.sun
 * @create 2018-03-30 ÏÂÎç3:23
 **/
public class BenzModel extends CarModel {


    @Override
    protected void start() {
        System.out.println("Æô¶¯±¼³Û");
    }

    @Override
    protected void alarm() {

        System.out.println("±¼³ÛÏìµÑ");

    }

    @Override
    protected void engineBoom() {

        System.out.println("±¼³ÛÒıÇæÉù");

    }

    @Override
    protected void stop() {
        System.out.println("±¼³ÛÍ£Ö¹");

    }
}
