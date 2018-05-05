package combine.mode;

import java.util.ArrayList;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 ����3:29
 **/
public class Branch extends Crop {

    //�˽ڵ���¼���֧
    private ArrayList<Crop> subordinateList = new ArrayList<>();

    public Branch(String name, String positiron, int salary) {
        super(name, positiron, salary);
    }


    public void addSubordinate(Crop crop){


        this.subordinateList.add(crop);
    }
    //��������

    public ArrayList<Crop> getSubordinate(){

        return this.subordinateList;
    }







}
