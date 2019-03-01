
public class LegacyCustomer implements Customer {
    private String name;
    private String id;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public LegacyCustomer() {
        System.out.println("Create LegacyCustomer");
    }

}
