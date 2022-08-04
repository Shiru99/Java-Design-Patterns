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

### [Proxy](#proxy)


---