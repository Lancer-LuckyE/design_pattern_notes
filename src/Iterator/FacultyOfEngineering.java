package Iterator;

import Composite.OrganizationComponent;
import java.util.ArrayList;

public class FacultyOfEngineering extends OrganizationComponent implements IFaculty {
    private ArrayList<OrganizationComponent> departments = new ArrayList<>();

    public FacultyOfEngineering(String name, String description) {
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
            departments.get(departments.indexOf(organizationComponent));
        }
        return null;
    }

    @Override
    protected void print() {
        Iterator iterator = getIterator();
        while (iterator.hasNext()) {
            OrganizationComponent department = (OrganizationComponent)iterator.next();
            System.out.println(department.getName());
            System.out.println(department.getDescription() + "\n");
        }
    }

    @Override
    public Iterator getIterator() {
        return new EngIterator();
    }

    private class EngIterator implements Iterator{

        int position = 0;

        @Override
        public boolean hasNext() {
            if (position < departments.size()) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            Object elem = departments.get(position);
            position = position + 1;
            return elem;
        }
    }
}
