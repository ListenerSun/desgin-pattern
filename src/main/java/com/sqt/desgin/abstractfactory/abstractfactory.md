###抽象工厂
- 定义:抽象工厂模式提供一个创建一系列相关或相互依赖对象的接口。无需指定它们具体的类。
- 类型:创建型。
- 适用场景:   
    + 客户端(应用层)不依赖于产品类实例如何被创建、实现等细节。
    + 强调一系列相关的产品对象(属于同一产品族)一起使用创建对象需要大量重复的代码。
    + 提供一个产品类库，素有的产品以同样的接口出现、从而使客户端不依赖于据以实现。
- 优点:   
    + 具体产品在应用层代码隔离、无需关心创建细节。
    + 将一个系列的产品族统一到一起创建。
- 缺点:
    + 规定了所有可能被创建的产品集合、产品组中扩展新的产品困难、需要修改抽象工厂的接口。
    + 增加了系统的抽象性和理解难度。
- 个人理解:就是定义一个接口作为工厂，在定义一系列的产品接口或者抽象类(比如:课本，学习资料)在该接口中定义一系列的生产产品的方法(就是工厂方法)
           ，然后定义不同的实现类去实现工厂接口，在方法里去实现生产具体产品。
- 产品等级结构与产品族示意图:  
[binaryTree](./产品等级结构与产品族图.png  "binaryTree")    
    
        
   