package combine.mode;

/**���ģʽ
 * @author Yuekai.sun
 * @create 2018-04-12 ����3:24
 **/
public abstract class Crop {


    //����
    private String name = "";
    //ְλ
    private String positiron = "";
    //нˮ
    private int salary = 0;
    //���ڵ�
    private Crop parent = null;

    public Crop(String name, String positiron, int salary) {
        this.name = name;
        this.positiron = positiron;
        this.salary = salary;
    }


    //��ȡԱ����Ϣ
    public String getInfo() {

        String info = "";

        info = this.name + this.positiron + this.salary;


        return info;


    }
    //��ȡ���ڵ�
    protected Crop getParent() {
        return parent;
    }
    //���ø��ڵ�
    public void setParent(Crop parent) {
        this.parent = parent;
    }


}








