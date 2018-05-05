package builder_mode;

import java.util.ArrayList;

/**
 * 建造者模式-满足不断变化的业务需求
 * @author Yuekai.sun
 * @create 2018-03-30 下午3:09
 **/
public abstract  class CarModel {

    private ArrayList<String> sequence = new ArrayList<>();

    protected abstract void start();

    protected abstract void alarm();

    protected abstract void engineBoom();

    protected abstract void stop();

    final public void setSequence(ArrayList<String>sequence){

        this.sequence = sequence;
    }

    final public void run(){

        for (int i = 0; i < this.sequence.size(); i++) {
            String action = sequence.get(i);

            if("start".equals(action)){

                this.start();




            }else if("stop".equals(action)){

                this.stop();
            }else if("alarm".equals(action)){

                this.alarm();
            }else if("engineBoom".equals(action)){

                this.engineBoom();
            }






        }



    }






}
