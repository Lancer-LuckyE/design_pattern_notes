package Composite;

import java.util.ArrayList;

public class Faculty extends OrganizationComponent {
    private ArrayList<OrganizationComponent> departments = new ArrayList<>();

    public Faculty(String name, String description) {
        super(name, description);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        departments.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        departments.remove(organizationComponent);
    }

    @Override
    protected OrganizationComponent getOrganizationComponent(OrganizationComponent organizationComponent) {
        if (departments.contains(organizationComponent)) {
            return departments.get(departments.indexOf(organizationComponent));
        }
        return null;
    }

    @Override
    protected void print() {
        System.out.println("------------" + getName() + "------------");
        System.out.println("Contains Departments: ");
        for(OrganizationComponent department : departments) {
            System.out.println(department.getName());
            System.out.println(department.getDescription() + "\n");
        }
    }
}
