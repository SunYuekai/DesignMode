package builder_mode;

/**
 * @author Yuekai.sun
 * @create 2018-03-30 下午3:23
 **/
public class BMWModel extends CarModel {


    @Override
    protected void start() {
        System.out.println("启动宝马");
    }

    @Override
    protected void alarm() {

        System.out.println("宝马响笛");

    }

    @Override
    protected void engineBoom() {

        System.out.println("宝马引擎声");

    }

    @Override
    protected void stop() {
        System.out.println("宝马停止");

    }
}
