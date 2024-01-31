# Tutorial 3

* Generics
* What is a ADT and how does that relate to abstraction
* Abstract concepts of a list and the List ADT(and other Java Collections)
* ArrayLists as an example compared to basic arrays

* Git - make a demo repo and show a bit of git (commit, add, squash merge, push, pull request)
* JUnit examples (for ArrayList)


## Classes with def


* Class: A basic building block of an object-oriented language such as Java. It's a blueprint for objects which encapsulates data and methods that operate on the data.

```java
public class Dog {
    String breed;
    int age;
    String color;

    void barking() {
    }

    void hungry() {
    }

    void sleeping() {
    }
}
```

* Concrete Class: A class that has an implementation for all of its methods. It can be instantiated.
  
```java
public class Cat {
    void meow() {
        System.out.println("Meow...");
    }
}
```

* Super Class: The class from which a subclass inherits. Also known as a parent class or base class.
```java
public class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}
```

* Sub Class: A class that inherits from another class (super class). Also known as a child class or derived class.
```java
public class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}
```
* Final Class: A class that cannot be subclassed. This is done for reasons of security and efficiency.
```java
public final class ImmutableClass {
    //...
}
```
* Inner Class: A class defined within another class, including static class, public class, protected class, private class, and package-private class.
```java
public class OuterClass {
    class InnerClass {
        //...
    }
}
```
* Anonymous Class: A class defined in an expression, without a name.
```java
Runnable r = new Runnable() {
    public void run() {
        System.out.println("Anonymous class");
    }
};
```
* Sealed Class: Sealed classes are classes that permit a restricted form of subclassing. They define which other classes are allowed to extend them. (This is a feature of Java 17 and onwards)
```java
public sealed class Shape permits Circle, Rectangle {
    //...
}
```
* Abstract Class: A class that cannot be instantiated and is typically used as a base class for other classes. Abstract classes can contain abstract methods (methods without bodies) as well as concrete methods (methods with bodies).
```java
public abstract class Animal {
    abstract void makeSound();
}
```
* Record Class (since Java 14): A class that is a transparent carrier for a fixed set of fields known as components or records. They provide a compact syntax for declaring classes which are supposed to be data carriers.
```java
public record Point(int x, int y) { }
```
* Interface: A reference type in Java, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. It provides total abstraction; methods in interfaces do not have a body. An interface is a completely abstract class that contains only abstract methods. Some interfaces can have defaults methods or static methods.
```java
interface Animal {
    void makeSound();
}
```
## Classes extended

### Polymorphism and Dynamic Dispatch
The word polymorphism literally means “many forms.” In the context of objectoriented design, it refers to the ability of a reference variable to take different forms.
Consider, for example, the declaration of a variable having CreditCard as its type:

```java
CreditCard card;
```

Because this is a reference variable, the statement declares the new variable, which
does not yet refer to any card instance. While we have already seen that we can
assign it to a newly constructed instance of the CreditCard class, Java also allows us
to assign that variable to refer to an instance of the PredatoryCreditCard subclass.
That is, we can do the following:

```java
CreditCard card = new PredatoryCreditCard(...);
```

This is a demonstration of what is known as the Liskov Substitution Principle,
which states that a variable (or parameter) with a declared type can be assigned
an instance from any direct or indirect subclass of that type. 

### Ecapsulation

Encapsulation is hiding the state or internal representation of an object from the consumer of an API and providing publicly accessible methods bound to the object for read-write access. This allows for hiding specific information and controlling access to internal implementation.

### Abstraction

Abstraction is hiding complexities of implementation and exposing simpler interfaces.

In OOP, abstraction means hiding the complex implementation details of a program, exposing only the public API required to use the implementation. In Java, we achieve abstraction by using interfaces and abstract classes.

### Interfaces and Abstract Classes

In order for two objects to interact, they must “know” about the various messages
that each will accept, that is, the methods each object supports. To enforce this
“knowledge,” the object-oriented design paradigm asks that classes specify the
application programming interface (API), or simply interface, that their objects
present to other objects. 

In the ADT-based approach to data
structures an interface defining an ADT is specified as a
type definition and a collection of methods for this type, with the arguments for
each method being of specified types. 

This specification is, in turn, enforced by
the compiler or runtime system, which requires that the types of parameters that
are actually passed to methods rigidly conform with the type specified in the interface. 

This requirement is known as strong typing. Having to define interfaces
and then having those definitions enforced by strong typing admittedly places a
burden on the programmer, but this burden is offset by the rewards it provides, for
it enforces the encapsulation principle and often catches programming errors that
would otherwise go unnoticed.

#### Interfaces

The main structural element in Java that enforces an API is an interface. An interface is a collection of method declarations with no data and no bodies. That is,
the methods of an interface are always empty; they are simply method signatures.
Interfaces do not have constructors and they cannot be directly instantiated.
When a class implements an interface, it must implement all of the methods
declared in the interface. In this way, interfaces enforce requirements that an implementing class has methods with certain specified signatures.

The ability of extending from more than one type is known as multiple inheritance.
In Java, multiple inheritance is allowed for interfaces but not for classes. The reason
for this rule is that interfaces do not define fields or method bodies, yet classes
typically do. Thus, if Java were to allow multiple inheritance for classes, there
could be a confusion if a class tried to extend from two classes that contained fields
with the same name or methods with the same signatures. Since there is no such
confusion for interfaces, and there are times when multiple inheritance of interfaces
is useful, Java allows interfaces to use multiple inheritance.
One use for multiple inheritance of interfaces is to approximate a multiple inheritance technique called the mixin.

```java
// Define a Flyable interface with a default method
interface Flyable {
    default void fly() {
        System.out.println("Flying...");
    }
}

// Define a Runnable interface with a default method
interface Runnable {
    default void run() {
        System.out.println("Running...");
    }
}

// Define a Robot class that implements both Flyable and Runnable
class Robot implements Flyable, Runnable {
    // No additional methods need to be implemented
}

public class Main {
    public static void main(String[] args) {
        // Create a new Robot object
        Robot robot = new Robot();

        // Call the fly and run methods
        robot.fly();
        robot.run();
    }
}
```

#### Abstract Classes
In Java, an abstract class serves a role somewhat between that of a traditional class
and that of an interface. Like an interface, an abstract class may define signatures
for one or more methods without providing an implementation of those method
bodies; such methods are known as abstract methods. However, unlike an interface, an abstract class may define one or more fields and any number of methods
with implementation (so-called concrete methods). An abstract class may also extend another class and be extended by further subclasses.
As is the case with interfaces, an abstract class may not be instantiated, that is,
no object can be created directly from an abstract class. In a sense, it remains an
incomplete class. A subclass of an abstract class must provide an implementation
for the abstract methods of its superclass, or else remain abstract. To distinguish
from abstract classes, we will refer to nonabstract classes as concrete classes.
In comparing the use of interfaces and abstract classes, it is clear that abstract
classes are more powerful, as they can provide some concrete functionality. However, the use of abstract classes in Java is limited to single inheritance, so a class
may have at most one superclass, whether concrete or abstract

```java
// Define an abstract class
abstract class Animal {
    // Define an abstract method
    abstract void makeSound();

    // Define a concrete method
    void eat() {
        System.out.println("The animal eats");
    }
}

// Define a Dog class that extends the abstract class Animal
class Dog extends Animal {
    // Provide an implementation for the abstract method
    void makeSound() {
        System.out.println("The dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a new Dog object
        Dog dog = new Dog();

        // Call the concrete method
        dog.eat();

        // Call the abstract method
        dog.makeSound();
    }
}
```

## Generics 

Generics in Java is a feature that allows you to define classes, interfaces, and methods with a placeholder (type parameter) for the type they operate on. This provides stronger type checks at compile time, eliminates the risk of ClassCastException at runtime, and enables programmers to implement generic algorithms.

Here's a simple example of a generic class:

```java

public class Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}

```

In this example, T is a type parameter that will be replaced by a real type when an object of Box is created:

```java

Box<Integer> integerBox = new Box<Integer>();
integerBox.set(new Integer(10));
Integer someInteger = integerBox.get();

```
Here's an example of a generic method:

```java

public class Util {
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
               p1.getValue().equals(p2.getValue());
    }
}

```

In this example, K and V are type parameters. This method can be used to compare any two Pair objects that have the same types for their keys and values

```java

Pair<Integer, String> p1 = new Pair<>(1, "apple");
Pair<Integer, String> p2 = new Pair<>(2, "pear");
boolean same = Util.<Integer, String>compare(p1, p2);

```

Generics also support bounded type parameters, wildcard type arguments, and generic interfaces. They are a powerful feature that greatly enhance the flexibility and type safety of your Java code


## ADT

An Abstract Data Type (ADT) in Java is a type (or class) for objects whose behavior is defined by a set of values and a set of operations. The "abstract" keyword indicates that the thing being defined is a blueprint for a set of objects, rather than being an object itself.

ADTs are a way to describe data structures in terms of their behavior (operations), and not their implementation. This means that the user of an ADT only needs to know what operations that ADT can perform, not how those operations are implemented.

 It provides implementations for all of the operations defined in the ADT. The user of this class doesn't need to know how these operations are implemented; they only need to know what operations are available.

 MIT on how to define operations on an ADT: https://web.mit.edu/6.031/www/sp17/classes/12-abstract-data-types/


 ```java

 public interface ListADT<T> {
    void add(T element);
    void add(int index, T element);
    T remove(int index);
    T get(int index);
    int size();
    boolean isEmpty();
}

 ```

 ## Java Collections 


Java Collection means a single unit of objects. Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet). Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.

Here's a brief description of the main interfaces and classes:

* List Interface: This is an ordered collection (also known as a sequence). The user of this interface has precise control over where in the list each element is inserted. The user can access elements by their integer index (position in the list), and search for elements in the list.

* Set Interface: This is a collection that cannot contain duplicate elements. It models the mathematical set abstraction.

* Queue Interface: This is a collection designed for holding elements prior to processing. Besides basic Collection operations, queues provide additional insertion, extraction, and inspection operations.

* Map Interface: This is an object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value.

* ArrayList Class: This is a resizable-array implementation of the List interface. It provides fast access to elements via their index, but it can be slow to insert or remove elements in the middle of the list because all subsequent elements must be shifted.

* LinkedList Class: This is a doubly-linked list implementation of the List and Deque interfaces. It provides fast insertion and removal of elements from the beginning or end, but it can be slow to access elements by their index because it needs to traverse the list.

* HashSet Class: This is a hash table based implementation of the Set interface. It allows null values and the null key. It doesn't guarantee any specific order of the entries.

* TreeSet Class: This is a NavigableSet implementation based on a TreeMap. The elements are ordered using their natural ordering, or by a Comparator provided at set creation time, depending on which constructor is used.

* HashMap Class: This is a hash table based implementation of the Map interface. It allows null values and the null key. It doesn't guarantee any specific order of the entries.


## Array vs ArrayList

An array is length is immutable, meaning its size is fixed at the time of creation. 

ArrayList is dynamic and can grow or shrink at runtime.

Arrays can contain any type of elements, including primitives.

ArrayLists can only contain objects, not primitives (though they can contain wrapper classes for primitives).

Arrays don't have built-in methods for common tasks like adding, removing, or finding elements. 

ArrayLists, being part of the Java Collections Framework, have many built-in methods that make it easy to manipulate the elements.
