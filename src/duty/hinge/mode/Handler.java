package duty.hinge.mode;

/**责任链模式 每个子类只处理一个类型请求 并且子类之间有传递关系
 * 在抽象类中调用抽象方法 会去调用子类实现
 * @author Yuekai.sun
 * @create 2018-04-10 下午4:40
 **/
public abstract class Handler {

    //定义等级
    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int MOTHER_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;
    //能处理的级别
    private int level = 0;
    //定义下一个责任人
    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }
    //定义传递责任链的方法用来处理请求(核心方法 子类不能重写)
    public final void handleMessage(Woman woman) {


        if (this.level == woman.getType()) {

            this.response(woman);


        } else if (this.nextHandler != null) {


            this.nextHandler.handleMessage(woman);
        } else {

            System.out.println("无后续处理人");
        }


    }



//    定义公共抽象方法 进行回应
    public abstract void response(Woman woman);
    }





