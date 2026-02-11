 class User {

    private final int roll;
    private final String firstname;
    private final String lastname;

    private User(Builder builder) {
        this.roll = builder.roll;
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
    }

    // Static Inner Builder Class
    public static class Builder {

        // Required field
        private final int roll;

        // Optional fields
        private String firstname;
        private String lastname;

        public Builder(int roll) {
            this.roll = roll;
        }

        public Builder firstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder lastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}


//
//1️⃣ What is Builder Design Pattern?
//
// The Builder Pattern is a Creational Design Pattern used to construct complex objects step by step.
//
// 👉 It allows you to create different representations of an object using the same construction process.
//
// Simple Meaning:
//
// When an object has many parameters (some optional, some required), instead of using a large constructor, we use a Builder to build the object step-by-step.
//
//2️⃣ Why Do We Need Builder?
//
// Sometimes:
//
// Object has many attributes.
//
// Constructor becomes very long.
//
// Too many constructor parameters create confusion.
//
// Some parameters are optional.
//
// Example problem (without Builder):
//
// User user = new User("John", 25, "Delhi", "9999999999", "john@gmail.com");
//
//
// What if we don’t need phone number?
// What if we don’t need email?
// This creates constructor confusion.
//
// 👉 Builder solves this problem.
//
//3️⃣ Real-Life Example
//
// Think of ordering a burger:
//
// Bread (required)
//
// Patty (required)
//
// Cheese (optional)
//
// Extra sauce (optional)
//
// Veg/Non-veg choice
//
// You don’t create burger in one step.
// You build it step by step.
//
// That’s Builder Pattern.
// 4️⃣ Structure of Builder Pattern
//
// Main components:
//
// Product → The complex object being built.
//
// Builder Interface → Defines building steps.
//
// Concrete Builder → Implements building steps.
//
// Director (Optional) → Controls construction order.
//
// Client → Uses builder to create object.
// 7️⃣ When to Use Builder Pattern?
//
// Use Builder when:
//
//         ✔ Object has many parameters
//✔ Object construction is complex
//✔ You want step-by-step creation
//✔ You want different representations of same object
//✔ You want immutable objects
//
//8️⃣ Real-World Examples
//
// StringBuilder in Java
//
// HTTP request builders
//
// Pizza/Burger builders
//
// Document builders
//
// Car manufacturing system
//
//9️⃣ Advantages
//
//✅ Clear step-by-step object creation
//
//✅ Avoids telescoping constructors
//
//✅ Improves readability
//
//✅ Better control over object construction
//
//✅ Can create different representations
//
//🔟 Disadvantages
//
//❌ More classes required
//
//❌ Code becomes longer
//
//❌ Slightly more complex design