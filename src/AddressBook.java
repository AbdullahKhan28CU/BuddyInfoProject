import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> Buddies;

    public AddressBook() {
        Buddies = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            Buddies.add(buddy);
        }
    }

    public void removeBuddy(int buddyNum) {
        if (buddyNum >= 0 && buddyNum < Buddies.size()) {
            Buddies.remove(buddyNum);
        }
    }

    public static void main(String[] args) {
        System.out.println("Address book");
        AddressBook Book = new AddressBook();
        BuddyInfo buddy = new BuddyInfo();
        Book.addBuddy (buddy);
        Book.removeBuddy(0);
    }
}
