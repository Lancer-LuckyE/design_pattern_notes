package Factory.StaticFactoryPattern;

import java.util.UUID;

public abstract class SuperClass {
    public abstract String getType();
    public abstract UUID getId();
    public abstract String getName();
    public abstract Object getAttribute1();
    public abstract Object getAttribute2();

    @Override
    public String toString() {
        return "ID: " + this.getId() + "\nName: " + this.getName() + "\nType: " + this.getType();
    }
}
