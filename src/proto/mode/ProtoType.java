package proto.mode;

/**
 * 原型模式:复制对象属性 修改对象个性化属性
 * 应用场景:解决多线程并发问题(多个对象无关)
 * 浅拷贝:不拷贝内部引用 深拷贝:拷贝内部引用对象和数组 重写clone方法中调用深拷贝对象clone方法
 * 原型模型不会执行构造方法 拷贝的是内存二进制流
 * @author Yuekai.sun
 * @create 2018-04-09 下午6:56
 **/
public class ProtoType implements  Cloneable{


    @Override
    protected ProtoType clone() throws CloneNotSupportedException {
        return (ProtoType)super.clone();
    }
}



