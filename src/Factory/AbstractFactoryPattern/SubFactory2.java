package Factory.AbstractFactoryPattern;

public class SubFactory2 implements Factory {
    @Override
    public SuperClass createClass(String type, String name) {
        type = type.toUpperCase();
        switch (type) {
            case "C":
                SubClass3 subClass3 = new SubClass3(name);
                System.out.println("SubClass3 is created.");
                return subClass3;
            case "D":
                SubClass4 subClass4 = new SubClass4(name);
                System.out.println("SubClass4 is created.");
                return subClass4;
            default:
                System.out.println("Type is not found.");
                throw new RuntimeException();
        }
    }
}
