package Composite;

public abstract class OrganizationComponent {
    private String name;
    private String description;

    public OrganizationComponent(String name, String description) {
        super();
        this.description = description;
        this.name = name;
    }

    protected void add(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    protected OrganizationComponent getOrganizationComponent(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    protected abstract void print();
}
