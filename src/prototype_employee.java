interface prototype{
    prototype clone();
}


public class prototype_employee implements prototype {

     String firstname;
     int roll;
    public prototype_employee(String firstname, int roll) {
        this.firstname = firstname;

        this.roll=roll;
    }

    @Override
    public prototype clone() {
        return new prototype_employee(this.firstname, this.roll);
    }
    public void show() {
        System.out.println("Name: " + this.firstname + ", Salary: " + this.roll);

}}

//
//
//1️⃣ What is Prototype Design Pattern?
//
//The Prototype Pattern is a Creational Design Pattern that creates new objects by copying (cloning) an existing object, instead of creating a new object from scratch.
//
//👉 In simple words:
//Instead of using new keyword to create objects, we copy an existing object.
//
//        2️⃣ Why Do We Need Prototype?
//
//Sometimes:
//
//Creating an object is costly (takes time, memory, database calls, complex calculations).
//
//Object creation involves heavy configuration.
//
//We need many similar objects with small changes.
//
//In such cases, instead of building the object again and again, we:
//
//        ✔ Create one object
//✔ Clone it
//✔ Modify if needed
//
//This improves performance and efficiency.
//
//3️⃣ Real-Life Example
//
//Imagine:
//
//You are filling an online job application form.
//
//Most fields (name, address, qualification) are same.
//
//Instead of filling everything again, you copy previous form and modify only small parts.
//
//        That’s Prototype pattern.
//
//4️⃣ Structure of Prototype Pattern
//
//Main components:
//
//Prototype Interface → declares clone method.
//
//Concrete Prototype → implements clone method.
//
//Client → clones objects instead of creating new ones.
//6️⃣ Shallow Copy vs Deep Copy
//
//This is very important in Prototype.
//
//        🔹 Shallow Copy
//
//Copies object.
//
//But nested objects are shared.
//
//Changes in one affect the other.
//
//        🔹 Deep Copy
//
//Copies object AND all nested objects.
//
//Completely independent copy.
//
//        Example:
//
//If Employee has an Address object:
//
//Shallow copy → both employees share same Address.
//
//Deep copy → each employee has separate Address.
//
//7️⃣ When to Use Prototype Pattern?
//
//Use Prototype when:
//
//        ✔ Object creation is expensive
//✔ You need many similar objects
//✔ You want to avoid complex constructor logic
//✔ You want dynamic object creation at runtime
//
//8️⃣ Real-World Use Cases
//
//Game development (copy characters, enemies)
//
//Document templates
//
//GUI object duplication
//
//Database object caching
//
//Graphic editors (copy shapes)
//
//9️⃣ Advantages
//
//✅ Faster object creation
//
//✅ Avoid complex initialization
//
//✅ Reduces subclassing
//
//✅ Improves performance
//
//🔟 Disadvantages
//
//❌ Cloning complex objects is difficult
//
//❌ Deep copy implementation can be tricky
//
//❌ If object has circular references, cloning becomes complicated