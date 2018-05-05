package factory.lazy_load_factory;

import factory.Human;
import factory.YellowHuman;
import factory.comm_mode.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * ��simple�������и��� ʹ��һ����̬����map���ֶԵ������������
 * @author Yuekai.sun
 * @create 2018-03-30 ����11:17
 **/
public class LazyFactory {

    private static final Map<String, Human> proMap =  new HashMap<>();
    // synchronized ���������ȫ����
    public static synchronized Human createProduct(String type)throws  Exception{

        Human human = null;
        //�����������Ͷ��� ȡ�� ��û�� �����type����newһ������proMap������
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
