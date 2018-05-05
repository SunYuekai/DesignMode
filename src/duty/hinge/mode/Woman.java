package duty.hinge.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-10 下午5:05
 **/
public abstract class Woman implements IWoman{
    /**
     * 1:女儿
     * 2:妻子
     * 3:寡妇
     *
     */
    private int type = 0;


    private String request;


    public Woman(int type, String request) {
        this.type = type;
        this.request = request;
    }

    public void Request(){




        if(this.type == 1){


            System.out.println("女儿的请示是"+request);
        }else
        if(this.type == 2){


            System.out.println("妻子的请示是"+request);
        }
        else if(this.type == 3){


            System.out.println("寡妇的请示是"+request);
        }



    }


    public int getType() {
        return type;
    }

    public String getRequest() {
        return request;
    }
}
