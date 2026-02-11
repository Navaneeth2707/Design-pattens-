// Step 1: Abstract Products
interface Button {
    void paint();
}

interface Checkbox {
    void paint();
}

// Step 2: Concrete Products for Windows
class WindowsButton implements Button {
    public void paint() {
        System.out.println("Render Windows Button");
    }
}

class WindowsCheckbox implements Checkbox {
    public void paint() {
        System.out.println("Render Windows Checkbox");
    }
}

// Step 3: Concrete Products for Mac
class MacButton implements Button {
    public void paint() {
        System.out.println("Render Mac Button");
    }
}

class MacCheckbox implements Checkbox {
    public void paint() {
        System.out.println("Render Mac Checkbox");
    }
}

// Step 4: Abstract Factory
interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

// Step 5: Concrete Factories
class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

class MacFactory implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }

    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}

// Step 6: Client (Application)
class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void render() {
        button.paint();
        checkbox.paint();
    }
}



//1. What is Abstract Factory Pattern?
//
//The Abstract Factory Pattern is a Creational Design Pattern that provides:
//
//An interface for creating families of related or dependent objects without specifying their concrete classes.
//
//In simple words:
//        "You have a factory that can produce multiple types of related objects, and you can switch the entire family easily without changing the client code."
//
//        2. Why Use Abstract Factory?
//
//To create groups of related objects together (a “family”).
//
//To ensure consistency among related objects.
//
//To decouple the client code from the concrete classes.
//
//Example Scenario:
//
//You are building a UI toolkit for multiple operating systems: Windows, Mac, Linux.
//
//Each OS has Buttons and CheckBoxes.
//
//The Abstract Factory allows you to create a WindowsButton & WindowsCheckbox or MacButton & MacCheckbox without changing client code.
//
//3. Structure of Abstract Factory (UML)
//AbstractFactory
//        + createButton()
//        + createCheckbox()
//              |
//                      ----------------
//                      |              |
//WindowsFactory   MacFactory
//      |              |
//              +-----------+     +-----------+
//              | Button    |     | Button    |
//        | Checkbox  |     | Checkbox  |
//
//
//AbstractFactory: Declares creation methods for a family of products.
//
//ConcreteFactory: Implements the creation methods for a specific family.
//
//        AbstractProduct: Interface for products (Button, Checkbox).
//
//ConcreteProduct: Implements specific products for a family.
//
//Client: Uses the abstract factory to get products.
//        5. When to Use Abstract Factory
//
//When your system needs to work with multiple families of related objects.
//
//When you want to enforce consistency among objects in a family.
//
//        Examples:
//
//Cross-platform UI (Windows/Mac/Linux buttons & checkboxes)
//
//Theme systems (Light/Dark mode UI elements)
//
//Database libraries (MySQL/PostgreSQL connections, queries, and commands)
//
//6. Advantages of Abstract Factory
//
//Encapsulates object creation (client does not know concrete classes)
//
//Promotes consistency among related objects
//
//Easy to change families of products
//
//Supports open/closed principle — can add new product families without changing client code
//
//7. Disadvantages of Abstract Factory
//
//Complexity increases — many interfaces and classes
//
//Harder to maintain if the number of products grows large
//
//Adding a new type of product (not a new family) requires changing all factories
//
//✅ Summary Table:
//
//Aspect	Details
//Pattern Type	Creational
//Purpose	Create families of related objects
//Pros	Encapsulates creation, consistency, flexible
//        Cons	Complex, maintenance overhead, adding new product types hard
//Common Use Cases	UI frameworks, theme systems, cross-database libraries