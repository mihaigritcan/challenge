package desingpatterns.singleton;

public class SimpleCounterUsage {
    public static void main(String[] args) {
        SimpleCounter simpleCounterA= SimpleCounter.getInstance();
        SimpleCounter simpleCounterB=SimpleCounter.getInstance();
        System.out.println(simpleCounterB==simpleCounterA);
        simpleCounterB.increment();
        simpleCounterA.increment();
        System.out.println(simpleCounterB.getCurrentCount());
    }
}
