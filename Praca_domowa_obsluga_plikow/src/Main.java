import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File path: ");
        String filePath = scanner.nextLine();

        AbstractBook bookA4 = new BookA4(filePath);
        System.out.println("Page 1 (BookA4): ");
        System.out.println(bookA4.page(1));

        AbstractBook bookB5 = new BookB5(filePath);
        System.out.println("Page 1 (BookB5): ");
        System.out.println(bookB5.page(1));

        scanner.close();
    }
}
