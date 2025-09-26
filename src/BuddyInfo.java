public class BuddyInfo {
    private String name;
    private String address;
    private int phone;

    public BuddyInfo() {
        this.name = "Joe";
        this.address = "1234 Biden Drive";
        this.phone = 1234567890;
    }

    public BuddyInfo(String name, String address, int phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone() {
        return phone;
    }

    public static void main(String[] args) {
        BuddyInfo Buddy = new BuddyInfo("Homer", "742 Evergreen Terrace", 5558707);
        System.out.println("Hello " + Buddy.getName());
    }
}
