package decorator.mode;

/**装饰模式
 *
 * Component 公共方法接口
 * Decorator装饰类(多为抽象类)
 * ConcreateDecorator若只有一个装饰类 可没有Decorator装饰类
 * ConcreateComponent核心业务类
 * 装饰模式可套多层 先执行最后装饰类的个性化方法
 * @author Yuekai.sun
 * @create 2018-04-12 上午10:05
 **/
public interface Component {



    //公共方法接口


    void operate();







}
