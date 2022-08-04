# Java Design Patterns

## Java Design Patterns: Creational

### [Singleton](#singleton)

1. Only one instance of the class is created.
2. Guarantee control of a resource.
3. Lazily loaded.
4. Examples: Runtime, Logger, Spring Bean 


### [Builder](#builder)

1. Separate the construction of a complex object from its representation so that the two can vary independently.
2. Examples: StringBuilder


### [Prototype](#prototype)

1. While creating a new object by copying the original object use the clone methods with existing object.


### [Factory Method](#factory-method)

1. Define an interface for creating an object, but let subclasses decide which class to instantiate.
2. Examples: Calender
3. With the Factory pattern, you produce instances of implementations (Apple, Banana, Cherry, etc.) of a particular interface -- say, IFruit.


### [Abstract Factory](#abstract-factory)

1. Define an interface for creating a family of products, but let subclasses decide which class to instantiate.
2. Examples: javax.xml.parsers.DocumentBuilderFactory class
3. With the Abstract Factory pattern, you provide a way for anyone to provide their own factory -- say, IFruitFactory or an IJuiceFactory.


---

## Java Design Patterns: Structural

### [Adapter/Wrapper](#Adapter/Wrapper)

1. Converts the interface of a class into another interface that a client wants.
2. Allows two or more previously incompatible objects to interact.
3. Examples: Arrays -> List, Streams

### [Bridge](#bridge)

1. Decouple the functional abstraction from the implementation so that the two can vary independently
2. Enables the separation of implementation from the interface & improves the extensibility.
2. Examples: JDBC Connection

### [Composite](#composite)

1. Composite pattern is a partitioning design pattern and describes a group of objects that is treated the same way as a single instance of the same type of object.
2. Examples: Maps (put, putAll)

### [Decorator](#decorator)

1. Decorator pattern allows a user to add new functionality to an existing object without altering its structure
2. Examples: InputStream

### [Facade](#facade)

1. Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system.
2. Example: java.net.URL

### [Flyweight](#flyweight)

1. Flyweight pattern is used to reduce the number of objects created and to decrease memory footprint.
2. Examples: HashMap

### [Proxy](#proxy)

1. Proxy pattern is used to provide a surrogate or placeholder for another object to control its access.
2. Examples: ProxyFactory


---


## Java Design Patterns: Behavioral

### [Chain of Responsibility](#chain-of-responsibility)

1. Chain of Responsibility pattern is used to provide a way for one object to request another object to handle a request.
2. Examples: java.util.logging.Logger

### [Command](#command)

1. Command pattern is used to encapsulate a request as an object, thereby letting you parameterize other objects with different requests, queue or log requests, and support undoable operations.
2. A request is wrapped under an object as command and passed to invoker object. Invoker object looks for the appropriate object which can handle this command and passes the command to the corresponding object which executes the command.
3. Examples: java.util.concurrent.ExecutorService

### [Iterator](#iterator)

1. Iterator pattern is used to provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
2. Examples: java.util.Iterator


### [Mediator](#mediator)

1. Mediator pattern is used to reduce coupling between classes that communicate with each other.
2. Examples: java.util.Timer


### [Observer](#observer)

1. Observer pattern is used to notify multiple objects about the changes in the state of a single object. (Publish/Subscribe)
2. Examples: java.util.Observable


### [State](#state)

1. The main idea of State pattern is to allow the object for changing its behavior without changing its class.
2. Examples: java.util.concurrent.locks.Lock?


### [Strategy](#strategy)

1. Strategy pattern is used to solve the problem of selecting an algorithm at run time.
2. Examples: java.util.Comparator


### [Template](#template)

1. In Template pattern, an abstract class exposes defined way(s)/template(s) to execute its methods
2. Collections.sort