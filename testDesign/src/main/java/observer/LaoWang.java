package observer;

/**
 * @Author: zh
 * @Date: 2019/5/21 20:51
 */
public class LaoWang implements Person {

    //老王自己的私有属性
    private String name = "小王";

    public LaoWang() {

    }

    @Override
    public void getMessage(String str) {
        System.out.println("老王接到了消息，消息内容是"+str);
    }
}
