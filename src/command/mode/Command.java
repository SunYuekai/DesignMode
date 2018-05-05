package command.mode;

/**命令角色(核心)
 * @author Yuekai.sun
 * @create 2018-04-10 下午3:41
 **/
public abstract class Command {
    //使用抽象类符合转置倒置原则 当对象需要外部注入(构造方法setter方法可采用子类声明                                                                                                                                                             限制传入对象)
    protected Reciver r1 = new Reciver1();
    protected Reciver r2 = new Reciver2();
    public abstract  void execute() ;





}
