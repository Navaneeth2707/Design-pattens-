interface shape{
    void draw();
}
class Circle implements shape{
    public void draw(){
        System.out.println("Circle");

    }
}
class Square implements shape{
    public void draw(){
        System.out.println("Square");

    }
}

public class Factory {
    public shape getshape(String ss){
        if(ss.equals("Circle")) {
            return new Circle();
        }
            return new Square();


    }
}



//1. What is the Factory Design Pattern?
//
//The Factory Pattern is a Creational Design Pattern that provides:
//
//A way to create objects without exposing the creation logic to the client.
//
//A common interface for creating objects of different types.
//
//In simple words: “You tell the factory what type of object you need, and it gives you the object. You don’t need to know the exact class or how it’s created.”
//
//        2. Why Use Factory Pattern?
//
//To decouple object creation from usage.
//
//To manage and organize object creation for complex systems.
//
//To promote flexibility — new object types can be added without changing client code.
//
//3. Structure of Factory Pattern (UML)
//          +----------------+
//                  |    Factory     |
//        +----------------+
//        | + create(type) |
//        +----------------+
//        |
//        ------------------------
//        |                      |
//        +-----------+          +-----------+
//        | ProductA  |          | ProductB  |
//        +-----------+          +-----------+
//        | ...       |          | ...       |
//        +-----------+          +-----------+
//
//
//Factory: Class with a method to create objects.
//
//        Product: Interface or abstract class.
//
//        5. When to Use Factory Pattern
//
//When the client should not know the exact implementation of the object.
//
//When object creation is complex or requires logic.
//
//When new types of objects may be added in the future.
//
//        Examples:
//
//GUI frameworks creating buttons for different OS
//
//Document editor creating different types of documents (PDF, Word)
//
//Notification service (Email, SMS, Push notification)
//
//6. Advantages of Factory Pattern
//
//Decouples object creation from client code
//
//Promotes code reusability
//
//Easy to add new types without modifying client code
//
//Centralized control of object creation
//
//7. Disadvantages of Factory Pattern
//
//More classes — can increase complexity
//
//Overhead — if there are only a few object types, using a factory may be unnecessary
//
//Can be hard to manage when the number of concrete classes grows too large
//
//8. Variations of Factory Pattern
//
//Simple Factory: One method creates different types of objects (like the example above).
//
//Factory Method Pattern: Defines an interface for creating an object, but subclasses decide which class to instantiate.
//
//Abstract Factory Pattern: Factory of factories — used to create families of related objects.
//
//✅ Summary Table:
//
//Aspect	Details
//Pattern Type	Creational
//Purpose	Encapsulate object creation
//Pros	Decouples creation, flexible, scalable
//Cons	More classes, complexity, overhead
//Common Use Cases	GUI buttons, document creation, notifications, shapes

//Concrete Product: Specific implementations of the product.

