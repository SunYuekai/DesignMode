package share.mode;

import java.util.HashMap;

/**��Ԫ���� ���ڴӹ�����д�ȡ����
 * @author Yuekai.sun
 * @create 2018-04-16 ����11:43
 **/
public class FlyweightFactory




{
    private static HashMap<String,Flyweight> pool = new HashMap<String,Flyweight>();

    //��Ԫ����

    public static Flyweight getFlyweight(String key){

        Flyweight flyweight = null;
        if(!pool.containsKey(key)){

            flyweight = new ConcreteFlyweight1(key);
            pool.put(key,flyweight);


        }else {

            flyweight = pool.get(key);

        }


        return flyweight ;



    }





}



