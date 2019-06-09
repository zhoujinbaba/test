/**
 * @Author: zh
 * @Date: 2019/5/21 20:41
 * 静态内部类
 */
public class Singleton3 {
    private static class SingletonHolder {
        private static final Singleton3 INSTANCES = new Singleton3();
    }
    private Singleton3() {}
    private static final Singleton3 getInstance() {
        return SingletonHolder.INSTANCES;
    }
}
