package Composite;

import java.util.ArrayList;

public class University extends OrganizationComponent {
    private ArrayList<OrganizationComponent> faculties = new ArrayList<>();

    public University(String name, String description) {
        super(name, description);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        faculties.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        faculties.remove(organizationComponent);
    }

    @Override
    protected OrganizationComponent getOrganizationComponent(OrganizationComponent organizationComponent) {
        if (faculties.contains(organizationComponent)) {
            return faculties.get(faculties.indexOf(organizationComponent));
        }
        return null;
    }

    @Override
    protected void print() {
        System.out.println("------------" + getName() + "------------");
        System.out.println("Contains Faculties: ");
        for(OrganizationComponent faculty : faculties) {
            System.out.println(faculty.getName());
            System.out.println(faculty.getDescription() + "\n");
        }
    }
}
