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
