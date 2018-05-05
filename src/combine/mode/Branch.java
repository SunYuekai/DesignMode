package combine.mode;

import java.util.ArrayList;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 下午3:29
 **/
public class Branch extends Crop {

    //此节点的下级分支
    private ArrayList<Crop> subordinateList = new ArrayList<>();

    public Branch(String name, String positiron, int salary) {
        super(name, positiron, salary);
    }


    public void addSubordinate(Crop crop){


        this.subordinateList.add(crop);
    }
    //返回下属

    public ArrayList<Crop> getSubordinate(){

        return this.subordinateList;
    }







}
