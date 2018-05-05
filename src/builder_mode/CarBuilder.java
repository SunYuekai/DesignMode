package builder_mode;

import java.util.ArrayList;

/**
 * 优化:不同车模型对应不同的builder 返回不同模型对象
 * 抽象方法:业务逻辑
 * @author Yuekai.sun
 * @create 2018-03-30 下午3:42
 **/
public abstract class CarBuilder {


    protected abstract void setSequence(ArrayList<String> sequence);

    protected abstract CarModel getModel();






}
