##工厂方法
- 定义:定义一个创建对象的接口，但让实现这个接口的类来决定实例化哪个类。工厂方法让类的实例化推迟到子类中进行。
- 类型: 创建型
- 使用场景:   
  - 创建需要大量重复的代码。
  - 客户端(应用层)不依赖于产品类实例如何被创建,实现等细节。
  - 一个类通过其子类来指定创建哪个对象。  
- 优点:   
  - 用户只需要关心所需产品对应的工厂，无需关心细节。
  - 加入新产品符合开闭原则，提高可扩展性。
- 缺点:   
  - 类的个数容易过多，增加复杂度。
  - 增加了系统的抽象性和理解难度。
- 个人理解: 工厂方法就是一个接口或者抽象类中有一个方法，该方法用来生产某一中对象。生产某一类对象的具体实现在接口或者抽象类的实现中去执行。   
   

