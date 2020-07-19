package Factory.StaticFactoryPattern;

public class ClientSide {
//    private ClassFactory factory = new ClassFactory(); // composition
//    private  ClassFactory factory; // aggregation
//    public void setFactory(ClassFactory factory) {
//        this.factory = factory;
//    }
    public static void main(String[] args) {
        SuperClass classA = ClassFactory.createClass("A", "classA");
        System.out.println("Class A: \n" + classA.toString() + "\n");

        SuperClass classB = ClassFactory.createClass("B", "classB");
        System.out.println("Class B: \n" + classB.toString() + "\n");

        SuperClass classC = ClassFactory.createClass("C" , "classC");
        System.out.println("Class C: \n" + classC.toString() + "\n");

        SuperClass classD = ClassFactory.createClass("D", "classD");
        System.out.println("Class D: \n" + classD.toString() + "\n");
    }
}
