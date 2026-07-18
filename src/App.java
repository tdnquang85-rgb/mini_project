import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    // tao menu book
    public static void menuBook(List<Book> listbook) {
        int choice = 0;
        do {
            // create new menu book
            System.out.println("Menu:");
            System.out.println("1. Add book");
            System.out.println("2. Remove book");
            System.out.println("3. Update book");
            System.out.println("4. Display all books");
            System.out.println("5. Search book by ID");
            System.out.println("6. Search book by name");
            System.out.println("7. Search book by range price");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter book ID: ");
                    String ID = sc.next();
                    System.out.println("Enter book name: ");
                    String name = sc.next();
                    System.out.println("Enter book price: ");
                    double price = sc.nextDouble();
                    System.out.println("Enter book quantity: ");
                    int quantity = sc.nextInt();
                    System.out.println("Enter book tac gia: ");
                    String tacGia = sc.next();
                    System.out.println("Enter book so trang: ");
                    int soTrang = sc.nextInt();
                    Book book = new Book(ID, name, price, quantity, tacGia, soTrang);
                    listbook.add(book);
                    break;
                }
                case 2: {
                    System.out.println("Enter book ID: ");
                    String ID = sc.next();
                    listbook.removeIf(p -> p.getID().equals(ID));
                    break;
                }
                case 3: {
                    System.out.println("Enter book ID: ");
                    String ID = sc.next();
                    // update book
                    for (int i = 0; i < listbook.size(); i++) {
                        if (listbook.get(i).getID().equals(ID)) {
                            System.out.println("Enter new book ID: ");
                            String newID = sc.next();
                            System.out.println("Enter new book name: ");
                            String newName = sc.next();
                            System.out.println("Enter new book price: ");
                            double newPrice = sc.nextDouble();
                            System.out.println("Enter new book quantity: ");
                            int newQuantity = sc.nextInt();
                            System.out.println("Enter new book tac gia: ");
                            String newTacGia = sc.next();
                            System.out.println("Enter new book so trang: ");
                            int newSoTrang = sc.nextInt();
                            System.out.print("Do you want to update this book? (y/n): ");
                            String isUpdateBook = sc.next();
                            if (isUpdateBook.equals("y")) {
                                Book book = new Book(newID, newName, newPrice, newQuantity, newTacGia, newSoTrang);
                                listbook.set(i, book);
                                System.out.println("Update book successfully");
                            } else {
                                System.out.println("Don't update book");
                            }

                        }
                    }
                    break;
                }
                case 4: {
                    for (Book book : listbook) {
                        book.display();
                    }
                    break;
                }
                case 5: {
                    System.out.println("Enter book ID: ");
                    String ID = sc.next();
                    // search by id near exact

                    for (int i = 0; i < listbook.size(); i++) {
                        if (listbook.get(i).getID().equals(ID)) {
                            System.out.println(listbook.get(i));
                            System.out.println(i);

                        }
                    }
                    break;
                }
                case 6: {
                    System.out.println("Enter book name: ");
                    String name = sc.next();
                    // search by name near exact
                    for (int i = 0; i < listbook.size(); i++) {
                        if (listbook.get(i).getName().equals(name)) {
                            System.out.println(listbook.get(i));
                            break;
                        }
                    }
                    break;
                }
                case 7: {
                    System.out.println("Enter book range price");

                    System.out.println("input price min: ");
                    double minPrice = sc.nextDouble();
                    System.out.println("input price max: ");
                    double maxPrice = sc.nextDouble();
                    for (int i = 0; i < listbook.size(); i++) {
                        if (listbook.get(i).getPrice() >= minPrice && listbook.get(i).getPrice() <= maxPrice) {
                            System.out.println(listbook.get(i));

                        }
                    }
                    break;
                }
                case 8: {
                    System.out.println("Exit");

                    break;
                }
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 8);
    }

    // tao menu Stationary
    public static void menuStationary(List<Stationary> listst) {
        int choice = 0;
        do {
            // create new menu book
            System.out.println("Menu:");
            System.out.println("1. Add Stationary");
            System.out.println("2. Remove Stationary");
            System.out.println("3. Update Stationary");
            System.out.println("4. Display all Stationary");
            System.out.println("5. Search Stationary by ID");
            System.out.println("6. Search Stationary by name");
            System.out.println("7. Search Stationary by range price");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter Stationary ID: ");
                    String ID = sc.next();
                    System.out.println("Enter Stationary name: ");
                    String name = sc.next();
                    System.out.println("Enter Stationary price: ");
                    double price = sc.nextDouble();
                    System.out.println("Enter Stationary quantity: ");
                    int quantity = sc.nextInt();
                    System.out.println("Enter Stationary chatlieu: ");
                    String chatLieu = sc.next();
                    System.out.println("Enter Stationary mau: ");
                    String mau = sc.next();
                    System.out.println("Enter Stationary nsx: ");
                    String nsx = sc.next();
                    Stationary stationary = new Stationary(ID, name, price, quantity, chatLieu, mau, nsx);
                    listst.add(stationary);
                    break;
                }
                case 2: {
                    System.out.println("Enter Stationary ID: ");
                    String ID = sc.next();
                    listst.removeIf(p -> p.getID().equals(ID));
                    break;
                }
                case 3: {
                    System.out.println("Enter Stationary ID: ");
                    String ID = sc.next();
                    // update book
                    for (int i = 0; i < listst.size(); i++) {
                        if (listst.get(i).getID().equals(ID)) {
                            System.out.println("Enter new Stationary ID: ");
                            String newID = sc.next();
                            System.out.println("Enter new Stationary name: ");
                            String newName = sc.next();
                            System.out.println("Enter new Stationary price: ");
                            double newPrice = sc.nextDouble();
                            System.out.println("Enter new Stationary quantity: ");
                            int newQuantity = sc.nextInt();
                            System.out.println("Enter new Stationary chat lieu: ");
                            String newChatLieu = sc.next();
                            System.out.println("Enter new Stationary mau: ");
                            String newMau = sc.next();
                            System.out.println("Enter new Stationary nsx: ");
                            String newNsx = sc.next();
                            Stationary stationary = new Stationary(newID, newName, newPrice, newQuantity, newChatLieu,
                                    newMau, newNsx);
                            System.out.println("you are sure to update ? y/n");
                            String isUpdate = sc.next();
                            if (isUpdate.equalsIgnoreCase("y")) {
                                listst.set(i, stationary);
                                System.out.println("update success");
                            } else {
                                System.out.println("update fail");
                            }
                            break;

                        }
                    }
                    break;
                }
                case 4: {
                    for (Stationary stationary : listst) {
                        stationary.display();
                    }
                    break;
                }
                case 5: {
                    System.out.println("Enter Stationary ID: ");
                    String ID = sc.next();
                    // search by id near exact

                    for (int i = 0; i < listst.size(); i++) {
                        if (listst.get(i).getID().equals(ID)) {
                            System.out.println(listst.get(i));
                            System.out.println(i);

                        }
                    }
                    break;
                }
                case 6: {
                    System.out.println("Enter Stationary name: ");
                    String name = sc.next();
                    // search by name near exact
                    for (int i = 0; i < listst.size(); i++) {
                        if (listst.get(i).getName().equals(name)) {
                            System.out.println(listst.get(i));
                            break;
                        }
                    }
                    break;
                }
                case 7: {
                    System.out.println("Enter Stationary range price");

                    System.out.println("input price min: ");
                    double minPrice = sc.nextDouble();
                    System.out.println("input price max: ");
                    double maxPrice = sc.nextDouble();
                    for (int i = 0; i < listst.size(); i++) {
                        if (listst.get(i).getPrice() >= minPrice && listst.get(i).getPrice() <= maxPrice) {
                            System.out.println(listst.get(i));

                        }
                    }
                    break;
                }
                case 8: {
                    System.out.println("Exit");
                    break;
                }
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 8);
    }

    // tao menu chọn book hay stationary
    public static void menuBookOrStationary(List<Book> listbook, List<Stationary> listst, Scanner sc) {
        System.out.println("=========================================");
        System.out.println("=========================================");
        System.out.println("choose manage: ");
        System.out.println("1. manage book");
        System.out.println("2. manage stationary");
        System.out.println("3. Exit");
        System.out.println("=========================================");
        System.out.print("input choice(1,2,3): ");
        int choiceBookOrStationary = 0;
        choiceBookOrStationary = sc.nextInt();
        do {
            switch (choiceBookOrStationary) {
                case 1:
                    menuBook(listbook);
                    choiceBookOrStationary = 0;
                    break;
                case 2:
                    menuStationary(listst);
                    choiceBookOrStationary = 0;
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
                default:

                    System.out.println("=========================================");
                    System.out.println("=========================================");
                    System.out.println("choose manage: ");
                    System.out.println("1. manage book");
                    System.out.println("2. manage stationary");
                    System.out.println("3. Exit");
                    System.out.println("=========================================");
                    System.out.print("input choice(1,2,3): ");
                    choiceBookOrStationary = sc.nextInt();
                    break;
            }
        } while (choiceBookOrStationary != 3);
    }

    public static void main(String[] args) {

        // tạo sách thử
        Book book1 = new Book("BK01", "Lập trình C", 100.0, 10, "Nguyễn Văn A", 400);
        Book book2 = new Book("BK02", "Lập trình C", 200.0, 10, "Nguyễn Văn A", 400);
        Book book3 = new Book("BK03", "Lập trình C", 300.0, 10, "Nguyễn Văn A", 400);
        Book book4 = new Book("BK04", "Lập trình C", 400.0, 10, "Nguyễn Văn A", 400);
        Book book5 = new Book("BK05", "Lập trình C", 9900.0, 10, "Nguyễn Văn A", 400);
        // tao văn phòng phẩm
        Stationary vpfp = new Stationary("VP01", "red", 100, 10, "giay", "do", "A");
        Stationary vpfp1 = new Stationary("VP02", "blue", 100, 10, "giay", "blue", "A");
        Stationary vpfp2 = new Stationary("VP03", "yellow", 100, 10, "giay", "yellow", "A");
        Stationary vpfp3 = new Stationary("VP04", "black", 100, 10, "giay", "black", "A");
        Stationary vpfp4 = new Stationary("VP05", "white", 100, 10, "giay", "white", "A");

        // book1.display();
        // vpfp.display();
        // add book to list
        List<Book> listbook = new ArrayList<>();
        listbook.add(book1);
        listbook.add(book2);
        listbook.add(book3);
        listbook.add(book4);
        listbook.add(book5);
        // add vpfp to list
        List<Stationary> listst = new ArrayList<>();
        listst.add(vpfp);
        listst.add(vpfp1);
        listst.add(vpfp2);
        listst.add(vpfp3);
        listst.add(vpfp4);

        // for (Book book : listbook) {
        // System.out.println(book);
        // }
        // for (Stationary st : listst) {
        // System.out.println(st);
        // }
        menuBookOrStationary(listbook, listst, sc);

        sc.close();

    }
}
