public class LogicalFun {
    public static void main(String args[]) {
        boolean isRaining=true;
        boolean isWarm=false;

        boolean op=isRaining && isWarm;
        System.out.println(op);

        op=isRaining || isWarm;
        System.out.println(op);

        op=!isRaining ;
        System.out.println(op);
    }
}
