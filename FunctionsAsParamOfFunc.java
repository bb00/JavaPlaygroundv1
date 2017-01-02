
import java.util.concurrent.Callable;


public class FunctionAsParamOfFunc {
    public static void main(String[] args) throws Exception {
        forLoop(() -> {
            System.out.println("shnoo");
            return (null);
        }, 3);
    }
    public static void forLoop(Callable<Void> func, int iterations) throws Exception {
        for(int i = 0; i < iterations; i++) {
            func.call();
        } 
    }
}
