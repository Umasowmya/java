public class CountDown {
    public static void main(String[] args) {
        countUpTo(10,20);
    }
    static void countDownFrom(int initialCount){
        if(initialCount>0){
            System.out.println(initialCount);
            countDownFrom(initialCount-1);
        }
    }
    static void countUpTo(int starting,int Ending){
        if(starting!=Ending){
            System.out.println(starting);
            countUpTo(starting+1,Ending);
        }
    }
}