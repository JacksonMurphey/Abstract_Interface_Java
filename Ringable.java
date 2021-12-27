public interface Ringable {

    String ring();
    String unlock();

    default void call(){
        System.out.println("you have a call");
    }
    
}
