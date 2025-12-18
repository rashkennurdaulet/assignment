public class Hospital {
    private String name;
    private String address;

    public Hospital(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Больница: " + name + " по адресу " + address);
    }
}
