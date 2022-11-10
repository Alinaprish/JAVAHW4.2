import jdk.internal.org.objectweb.asm.tree.LocalVariableAnnotationNode;

public class Main {
    public static void main(String[] args) {
        int a = 55;
        double b = (int) 1.77;
        BmiService service = new BmiService();
        int MyIndex  = service.calculate(55, 1.77);
        System.out.println(MyIndex);

    }
}