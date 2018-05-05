package singleton;

/**
 *
 * Demo class
 * 懒汉:调用时为空创建对象
 * 恶汉:类初始化创建对象
 * 解决线程安全:加双层锁结构 使用synchronized
 * 扩展:类只需要几个对象 私有化构造方法 使用静态变量限制最大对象数 使用vector线程安全的容器
 * @author Yuekai.Sun
 * @create 2018-03-29 下午4:18
 */
public class Emperor {
    //初始化一个皇帝
    private static final Emperor emperor = new Emperor();

    private Emperor() {

        //私有构造方法 目的不产生第二个皇帝

    }

    public static Emperor getInstance() {
        //通过公共方法提供实例 保证单一对象


        return emperor;

    }

    public  void say() {

        System.out.println("我是皇帝001..."+this.toString());


    }
}
