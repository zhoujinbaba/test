package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zh
 * @Date: 2019/5/21 20:55
 */
public class XiaoMei {
    List<Person> personList = new ArrayList<Person>();

    public XiaoMei() {
    }

    public void addPerson(Person person) {
        personList.add(person);
    };
    //遍历集合发送消息给所有观察的人
    public void notifyPerson() {
        for (Person person : personList) {
            person.getMessage("等你来打牌哦");

        }
    }
}