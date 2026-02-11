public class Singleton {
//    Eagle lodeing
//    public static Singleton instance=new Singleton();
//      public static Singleton getInstance()
//      {
//          return instance;
//      }

    // lazy loding
    public static Singleton instance;
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();

        }
        return instance;
    }
     }
//1. What is the Singleton Design Pattern?
//
//The Singleton Pattern is a Creational Design Pattern that ensures:
//
//Only one instance of a class is created.
//
//Provides a global point of access to that instance.
//
//In simple words: “No matter how many times you try to create an object, there will only ever be one object of that class in the system.”
//
//        2. Why use Singleton Pattern?
//
//To control access to shared resources (like a database or configuration file).
//
//To ensure consistency when multiple parts of a system need the same object.
//
//To save memory when creating multiple instances is unnecessary.
//
//3. How Singleton Works (Structure)
//
//A typical singleton class has:
//
//Private static variable – Holds the single instance.
//
//Private constructor – Prevents external instantiation.
//
//        Public static method – Provides global access to the instance.
//
//UML Diagram of Singleton:
//
//        +------------------+
//        |   Singleton      |
//        +------------------+
//        | - instance       |  <-- private static
//+------------------+
//        | + getInstance()  |  <-- public static
//+------------------+
//        5. When to Use Singleton
//
//Logging system (Logger)
//
//Configuration settings
//
//Database connections (DBConnection)
//
//Thread pool management
//
//        Caching
//
//Example: Only one database connection should exist in an application to avoid multiple connections wasting resources.
//
//6. Advantages of Singleton Pattern
//
//Controlled access: Only one instance exists.
//
//Lazy initialization: Instance can be created only when needed.
//
//Reduced memory usage: Avoids unnecessary objects.
//
//Global access: Any part of the application can access the same object.
//
//        7. Disadvantages of Singleton Pattern
//
//Difficult to test: Single instance makes unit testing harder.
//
//Can introduce global state: May lead to tight coupling and hidden dependencies.
//
//Multithreading issues: Without proper handling, multiple threads may create multiple instances.
//
//Hard to subclass: Private constructor restricts inheritance.
//        ✅ Summary:
//
//Aspect	Details
//Pattern Type	Creational
//Purpose	Single instance, global access
//Pros	Controlled access, lazy init, memory efficient
//Cons	Hard to test, thread-safety issues, global state
//Common Use Cases	Logger, DB connections, Config, Caching