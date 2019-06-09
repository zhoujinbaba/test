/**
 * @Author: zh
 * @Date: 2019/5/21 20:37
 * 单利模式饿汉式
 */
public class Singleton2 {
    private static Singleton2 instance = new Singleton2();

    public Singleton2() {
    }
    public static Singleton2 getInstance() {
        return instance;
    }

}
