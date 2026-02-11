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
