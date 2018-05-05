package factory.lazy_load_factory;

import factory.Human;
import factory.YellowHuman;
import factory.comm_mode.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * 在simple工厂进行改造 使用一个静态对象map保持对单例对象的引用
 * @author Yuekai.sun
 * @create 2018-03-30 上午11:17
 **/
public class LazyFactory {

    private static final Map<String, Human> proMap =  new HashMap<>();
    // synchronized 解决并发安全问题
    public static synchronized Human createProduct(String type)throws  Exception{

        Human human = null;
        //若有这种类型对象 取出 若没有 则根据type名字new一个放入proMap并返回
        if(proMap.get(type) == null){

            if("yellow".equals(type)) {


                YellowHuman yellowHuman = new YellowHuman();
                proMap.put("yellow", yellowHuman);
                human = yellowHuman;

            }


        }else {


            human = proMap.get(type);


        }


        return human;




    }


}
