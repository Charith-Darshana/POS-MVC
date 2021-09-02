package lk.ijse.pos.entity;

public class Customer {
    private String  cID;
    private String name;
    private String address;

    public Customer() {
    }

    public Customer(String cID, String name, String address) {
        this.cID = cID;
        this.name = name;
        this.address = address;
    }

    public String getcID() {
        return cID;
    }

    public void setcID(String cID) {
        this.cID = cID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cID='" + cID + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
