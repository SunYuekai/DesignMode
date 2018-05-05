package combine.mode;

/**组合模式
 * @author Yuekai.sun
 * @create 2018-04-12 下午3:24
 **/
public abstract class Crop {


    //名称
    private String name = "";
    //职位
    private String positiron = "";
    //薪水
    private int salary = 0;
    //父节点
    private Crop parent = null;

    public Crop(String name, String positiron, int salary) {
        this.name = name;
        this.positiron = positiron;
        this.salary = salary;
    }


    //获取员工信息
    public String getInfo() {

        String info = "";

        info = this.name + this.positiron + this.salary;


        return info;


    }
    //获取父节点
    protected Crop getParent() {
        return parent;
    }
    //设置父节点
    public void setParent(Crop parent) {
        this.parent = parent;
    }


}








