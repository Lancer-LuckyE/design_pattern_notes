package Factory.StaticFactoryPattern;

public class ClassFactory {
    public static SuperClass createClass(String type, String name) {
        type = type.toUpperCase();
        switch (type) {
            case "A":
                SubClass1 subClass1 = new SubClass1(name);
                System.out.println("SubClass1 is created.");
                return subClass1;
            case "B":
                SubClass2 subClass2 = new SubClass2(name);
                System.out.println("SubClass2 is created.");
                return subClass2;
            case "C":
                SubClass3 subClass3 = new SubClass3(name);
                System.out.println("SubClass3 is created.");
                return subClass3;
            default:
                System.out.println("Type is not found.");
                throw new RuntimeException();
        }
    }
}
