package builder_mode;

import java.util.ArrayList;

/**�Ż�:��������������sequece��װ���������� ���ض���ģ�Ͷ���
 * @author Yuekai.sun
 * @create 2018-03-30 ����3:40
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
