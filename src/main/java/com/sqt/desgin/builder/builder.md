###建造者模式
- 定义:将一个复杂对象的构建与它表示分离,使得同样的构建过程可以创建不同的表示。
        用户只需指定需要建造的类型就可以得到它们,建造过程以及细节不需要知道。
- 类型:创建型
- 适用场景:   
    + 一个对象有非常复杂的内部结构(很多属性)
    + 想把复杂对象的创建和使用分离。
- 优点:   
    + 封装性好、创建和使用分离。
    + 扩展性好、建造类之间独立、一定程度上解耦。
- 缺点:   
    + 产生多余的builder对象。
    + 对象内部结构及属性发生变化时建造者需要修改，成本较大。
- 个人理解:就是在创建一个复杂对象时，在对象内部写一个静态内部类作为建造者对象，建造者对象跟复杂对象的属性相同，
            同时复杂对象提供一个构造方法将建造者对象注入进去。然后通过链式调用建造者的方法(在该方法中给属性赋值)
           返回创建者对象,然后最后通过builder()方法创建复杂的对象。个人理解建造者模式跟工厂模式的区别在于:工厂模式生产
           同一类对象，建造者生产同一类不同属性的对象。                    