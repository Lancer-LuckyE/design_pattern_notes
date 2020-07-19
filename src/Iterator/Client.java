package Iterator;

import Composite.Department;
import Composite.Faculty;
import Composite.OrganizationComponent;

public class Client {
    public static void main(String[] args) {
        FacultyOfEngineering engineering = new FacultyOfEngineering("Engineering", "Faculty of Engineering");

        OrganizationComponent department1 = new Department("Department1", "Department1 description");
        OrganizationComponent department2 = new Department("Department2", "Department2 description");
        OrganizationComponent department3 = new Department("Department3", "Department3 description");
        OrganizationComponent department4 = new Department("Department4", "Department4 description");
        OrganizationComponent department5 = new Department("Department5", "Department5 description");

        engineering.add(department1);
        engineering.add(department2);
        engineering.add(department3);
        engineering.add(department4);
        engineering.add(department5);

        engineering.print();
        System.out.println("\n===============================\n");
        engineering.remove(department5);
        engineering.print();
    }
}
