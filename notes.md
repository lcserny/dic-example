v1 Thoughts:
----------------------------------------------------
- At first look, there seems nothing wrong with above implementation. But above code logic has certain limitations 
- MyApplication class is responsible to initialize the email service and then use it. This leads to hard-coded dependency. If we want to switch to some other advanced email service in future, it will require code changes in MyApplication class. This makes our application hard to extend and if email service is used in multiple classes then that would be even more harder
- If we want to extend our application to provide additional messaging feature, such as SMS or Facebook message then we would need to write another application for that. This will involve code changes in application classes and in client classes too.
- Testing the application will be very difficult since our application is directly creating the email service instance. There is no way we can mock these objects in our test classes.


v2 Thoughts:
----------------------------------------------------
- Dependency Injection in java requires at least following:
    1. Service components should be designed with base class or interface. It’s better to prefer interfaces or abstract classes that would define contract for the services
    2. Consumer classes should be written in terms of service interface
    3. Injector classes that will initialize the services and then the consumer classes
- Dependency Injection in Java is a way to achieve Inversion of control (IoC) in our application by moving objects binding from compile time to runtime. We can achieve IoC through Factory Pattern, Template Method Design Pattern, Strategy Pattern and Service Locator pattern too
- Spring Dependency Injection, Google Guice and Java EE CDI frameworks facilitate the process of dependency injection through use of Java Reflection API and java annotations. All we need is to annotate the field, constructor or setter method and configure them in configuration xml files or classes
- Some of the benefits of using Dependency Injection in Java are
    1. Separation of Concerns
    2. Boilerplate Code reduction in application classes because all work to initialize dependencies is handled by the injector component
    3. Configurable components makes application easily extendable
    4. Unit testing is easy with mock objects
- Java Dependency injection has some disadvantages too
    1. If overused, it can lead to maintenance issues because effect of changes are known at runtime
    2. Dependency injection in java hides the service class dependencies that can lead to runtime errors that would have been caught at compile time