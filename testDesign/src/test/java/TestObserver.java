import observer.LaoLi;
import observer.LaoWang;
import observer.XiaoMei;

/**
 * @Author: zh
 * @Date: 2019/5/21 21:00
 */
public class TestObserver {
    public static void main(String[] args) {
        XiaoMei xiaoMei = new XiaoMei();
        LaoLi laoLi = new LaoLi();
        LaoWang laoWang = new LaoWang();

        //老王和老李要去小美那里注册一下
        xiaoMei.addPerson(laoLi);
        xiaoMei.addPerson(laoWang);
        //小美开始撩骚了

        xiaoMei.notifyPerson();
    }
}
