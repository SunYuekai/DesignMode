package builder_mode;

import java.util.ArrayList;

/**优化:将场景类中设置sequece封装到导演类中 返回对象模型对象
 * @author Yuekai.sun
 * @create 2018-03-30 下午3:40
 **/
public class Director {

    private CarBuilder benzBuilder = new BenzCarBuilder();

    private CarBuilder bmwBuilder =new BMWCarBuilder();


    public CarModel getBenzA(){

        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("start");
        benzBuilder.setSequence(sequence);
        return benzBuilder.getModel();
    }


    public CarModel getBenzB(){

        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("start");
        sequence.add("stop");
        benzBuilder.setSequence(sequence);
        return benzBuilder.getModel();
    }
    public CarModel getBMWA(){

        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("stop");
        bmwBuilder.setSequence(sequence);
        return bmwBuilder.getModel();
    }


    public CarModel getBMWB(){

        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("alarm");
        sequence.add("stop");
        bmwBuilder.setSequence(sequence);
        return bmwBuilder.getModel();
    }






}
