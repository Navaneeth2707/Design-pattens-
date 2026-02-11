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
