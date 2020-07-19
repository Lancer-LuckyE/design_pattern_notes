package Composite;

public class Client {
    public static void main(String[] arges) {
        OrganizationComponent uOttawa = new University("uOttawa", "University of Ottawa");
        OrganizationComponent faculty1 = new Faculty("Communication", "Communication Faculty");
        OrganizationComponent faculty2 = new Faculty("Engineering", "Engineering Faculty");
        OrganizationComponent department1 = new Department("Department1", "Department1 description");
        OrganizationComponent department2 = new Department("Department2", "Department2 description");
        OrganizationComponent department3 = new Department("Department3", "Department3 description");
        OrganizationComponent department4 = new Department("Department4", "Department4 description");
        OrganizationComponent department5 = new Department("Department5", "Department5 description");

        uOttawa.add(faculty1);
        uOttawa.add(faculty2);

        faculty1.add(department1);
        faculty1.add(department2);
        faculty2.add(department3);
        faculty2.add(department4);
        faculty2.add(department5);

        uOttawa.print();
        faculty1.print();
        faculty2.print();

        uOttawa.getOrganizationComponent(faculty2).remove(department5);
        faculty2.print();
    }
}
