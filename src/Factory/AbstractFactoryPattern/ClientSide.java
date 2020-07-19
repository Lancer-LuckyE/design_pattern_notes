package Factory.AbstractFactoryPattern;

public class ClientSide {
//    private ClassFactory factory = new ClassFactory(); // composition
//    private  ClassFactory factory; // aggregation
//    public void setFactory(ClassFactory factory) {
//        this.factory = factory;
//    }
    private Factory factory;

    public ClientSide(Factory factory) {
        setFactory(factory);
    }

    private void setFactory(Factory factory) {
        this.factory = factory;
    }

    public Factory getFactory() {
        return this.factory;
    }

    public static void main(String[] args) {
        // Client1 has factory1 that can create subclass1 and subclass2
        ClientSide client1 = new ClientSide(new SubFactory1());

        SuperClass classA = client1.getFactory().createClass("A", "classA");
        System.out.println("Class A: \n" + classA.toString() + "\n");

        SuperClass classB = client1.getFactory().createClass("B", "classB");
        System.out.println("Class B: \n" + classB.toString() + "\n");


        // Client2 has factory2 that can create subclass3 and subclass4
        ClientSide client2 = new ClientSide(new SubFactory2());

        SuperClass classC = client2.getFactory().createClass("C" , "classC");
        System.out.println("Class C: \n" + classC.toString() + "\n");

        SuperClass classD = client2.getFactory().createClass("D", "classD");
        System.out.println("Class D: \n" + classD.toString() + "\n");
    }
}
