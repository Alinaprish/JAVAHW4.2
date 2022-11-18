import jdk.internal.org.objectweb.asm.tree.LocalVariableAnnotationNode;

public class Main {
    public static void main(String[] args) {
        int weight = 55;
        double growth = (int) 1.77;
        BmiService service = new BmiService();
        int MyIndex  = service.calculate(55, 1.77);
        System.out.println(MyIndex);

    }
}
