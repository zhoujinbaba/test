/**
 * @Author: zh
 * @Date: 2019/5/21 20:33
 * 单利模式 懒汉式
 */
public class Singleton {
    private static Singleton singleton;

    public Singleton() {
    }
    public static synchronized Singleton getInstance() {
        if (singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
