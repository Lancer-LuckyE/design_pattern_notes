package Factory.AbstractFactoryPattern;

import java.util.UUID;

public class SubClass2 extends SuperClass {
    private String type;
    private UUID id;
    private String name;
    private Object attribute1;
    private Object attribute2;

    public SubClass2(String name){
        this.type = "B";
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public UUID getId() {
        return this.id;
    }

    public String getType() {
        return this.type;
    }

    public Object getAttribute1() {
        return attribute1;
    }

    public Object getAttribute2() {
        return attribute2;
    }
}
