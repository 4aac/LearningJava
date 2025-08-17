import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static boolean cont = true;
    public static List<HashMap<String, String>> contacts = new ArrayList<>();

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        while (cont == true) {
            System.out.println("\n---WELCOME TO THE APP ---");

            System.out.println(
                "\n Select number between 1-6:\n" +
                "    1) Introduce contact\n" +
                "    2) Remove contact\n" +
                "    3) See contacts\n" +
                "    4) Search contacts\n" +
                "    5) Exit\n"
            );

            System.out.print("Choose an option: ");
            int option;
            try {
                option = Integer.parseInt(myObj.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid option");
                continue;
            }

            if (option == 1) {
                HashMap<String, String> contact = new HashMap<>();
                System.out.print("Name of the new contact: ");
                String name = myObj.nextLine();
                String phone;
                do {
                    System.out.print("Phone of the new contact: ");
                    phone = myObj.nextLine();
                    if (phone.length() > 11) {
                        System.out.println("Phone number too long. Try again.");
                    }
                } while (phone.length() > 11);
                contact.put("Name", name);
                contact.put("Phone", phone);
                contacts.add(contact);
            } else if (option == 2) {
                System.out.print("What contact do you want to delete: ");
                String nameDel = myObj.nextLine();
                boolean found = false;
                for (int i = 0; i < contacts.size(); i++) {
                    if (contacts.get(i).get("Name").equalsIgnoreCase(nameDel)) {
                        contacts.remove(i);
                        System.out.println("Contact deleted.");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Contact not in Contacts");
                }
            } else if (option == 3) {
                for (int i=0; i < contacts.size(); i++) {
                    System.out.println("Name: " + contacts.get(i).get("Name") + " Phone number: " + contacts.get(i).get("Phone"));
                }
            } else if (option == 4) {
                System.out.print("What contact do you want to modify? ");
                String nameFind = myObj.nextLine();
                boolean found = false;
                for (int i = 0; i < contacts.size(); i++) {
                    if (contacts.get(i).get("Name").equalsIgnoreCase(nameFind)) {
                        contacts.remove(i);

                        System.out.print("Change its name: ");
                        String newName = myObj.nextLine();

                        System.out.print("Change its phone number: ");
                        String phoneNumber = myObj.nextLine();

                        HashMap<String, String> contact = new HashMap<>();
                        contact.put("Name", newName);
                        contact.put("Phone", phoneNumber);

                        contacts.add(contact);
                        System.out.println("Contact modified.");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Contact not in Contacts");
                }

            } else if (option == 5) {
                System.out.println("Exiting...");
                cont = false;
            } else {
                System.out.println("\n\nInvalid option");
            }
        }
        myObj.close();
    }
}
