public class StringBuilderFun {
    public static void main(String args[]){
        StringBuilder s = new StringBuilder("Uma");
        System.out.println(s);

        s.append(" Sowmya");
        System.out.println(s);

        s.insert(0,"Garlapati ");
        System.out.println(s);

        s.replace(0,9,"GARLAPATI ");
        System.out.println(s);

        s.delete(0,9);
        System.out.println(s);
    }
}
