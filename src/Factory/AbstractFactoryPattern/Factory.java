package Factory.AbstractFactoryPattern;

public interface Factory {
    SuperClass createClass(String classType, String name);
}
