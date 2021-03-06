package Hospital;

import Hospital.humanAbstractFactory.FactoryProducer;
import Hospital.humanAbstractFactory.Human;
import Hospital.humanAbstractFactory.HumanFactory;

public class Main {
    public static void main (String arqs[]) {
        HumanFactory humanFactory = FactoryProducer.getFactory(FactoryProducer.HumanType.MALE);
        Human human = humanFactory.createMaleHuman(HumanFactory.HumanBodyType.MESOMORPH, -7);
        System.out.println(human.getHealth());
        System.out.println(human.getHumanType());
        System.out.println(human.getHumanBodyType());
        System.out.println(human.getId());
        System.out.println(human.getName());

//                синглтон
//                адаптер
//                синглтон
//                приватный конструктор_get instance если ноль создать. если нет 1 вернуть
    }
}
