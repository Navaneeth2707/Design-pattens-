//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Singleton
//        Singleton s = Singleton.getInstance();
//        Singleton s1 = Singleton.getInstance();
//        System.out.println("Singleton created1");
//        System.out.println(s);
//        System.out.println(s1);

//        //Factory
//        Factory f=new Factory();
//        shape s=f.getshape("Square");
//
//         s.draw();
        //Abstract factory
//        GUIFactory factory = new WindowsFactory();
//
//        Application app = new Application(factory);
//        app.render();

//        //Prototype
//        prototype_employee emp1=new prototype_employee("a",10);
//        prototype_employee emp2=(prototype_employee) emp1.clone();
//        emp2.show();

          //Builder
        User user = new User.Builder(10)
                .firstname("Navaneeth")
                .lastname("K")
                .build();

        System.out.println(user);
    }
}
