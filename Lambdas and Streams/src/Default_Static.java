interface Methods{
    public void print();

    //default method
    default void printing(){
        System.out.println("default  method");
    }
    //static method
    static void printed(){
        System.out.println("static method");
    }
}

public class Default_Static implements Methods{

        public void print(){
            System.out.println("abstract method");
        }

        public static void main(String args[]){
            Default_Static d = new Default_Static();
            d.print();
            Methods.printed();
            d.printing();
        }
}
