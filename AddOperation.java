import java.util.ArrayList;
import java.util.Scanner;

public class AddOperation {
    protected void addOperation(ArrayList<String> products){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую покупку вы хотите добавить?");
        String input = scanner.nextLine();
        products.add(input);
        System.out.println("Итого в списке покупок: " + products.size() + " товаров");
    }
}
