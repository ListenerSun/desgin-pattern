###观察者模式
- 定义:定义了对象之间的一对多的依赖，染过个观察者对象同时监听某一个主题对象。
        当主题对象发生变化时，它的所有依赖者(观察者)都会手法哦通知并更新。
- 适用场景:关联行为场景，建立一套触发机制
- 优点:
    + 观察者和被观察者之间建立一个抽象的组合
    + 观察者模式支持广播通信
- 缺点:
    + 观察者之间有过多的细节依赖、提高时间小号以及程序复杂度
    + 使用要得当，避免循环调用
- 个人理解: 被观察者继承Observable类，并且在业务逻辑中执行setChanged()方法代表被观察者
            状态发生了改变，然后执行notifyObservers(参数)方法可以通知实现Observer接口的类
            执行update方法。
    