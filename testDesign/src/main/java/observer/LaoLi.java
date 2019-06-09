package observer;

/**
 * @Author: zh
 * @Date: 2019/5/21 20:53
 */
public class LaoLi implements Person {
    //老李自己的私有属性
    private String name = "老李";

    public LaoLi() {
    }



    @Override
    public void getMessage(String str) {
        System.out.println("老李接到了消息，消息内容是"+str);
    }
}
