package Composite;

import java.util.ArrayList;

public class Department extends OrganizationComponent {
    public Department(String name, String description) {
        super(name, description);
    }

    @Override
    protected void print() {
        System.out.println(getName() + ": " + getDescription());
    }
}
