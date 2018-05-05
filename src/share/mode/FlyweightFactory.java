package share.mode;

import java.util.HashMap;

/**享元工厂 用于从共享池中存取对象
 * @author Yuekai.sun
 * @create 2018-04-16 上午11:43
 **/
public class FlyweightFactory




{
    private static HashMap<String,Flyweight> pool = new HashMap<String,Flyweight>();

    //享元工厂

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



