import java.util.ArrayList;
import java.util.Scanner;

public class GoodsOperations {
    Scanner scanner = new Scanner(System.in);

    protected void showOperation(ArrayList<String> list) {
        System.out.println("Список покупок:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }

    protected void addOperation(ArrayList<String> list) {
        System.out.println("Какую покупку вы хотите добавить?");
        String input = scanner.nextLine();
        list.add(input);
        System.out.println("Итого в списке покупок: " + list.size() + " товаров");
    }

    protected void deleteOperation(ArrayList<String> list) {
        showOperation(list);
        System.out.println("Какую покупку вы хотите удалить? Введите номер или название");
        String input = scanner.nextLine();
        try {
            int numberToDelete = Integer.parseInt(input) - 1;
            System.out.println("Покупка " + "'" + list.get(numberToDelete) + "'" + " удалена\n");
            list.remove(numberToDelete);
            showOperation(list);
        } catch (NumberFormatException ex) {
            list.remove(input);
            System.out.println("Покупка " + "'" + input + "'" + " удалена\n");
            showOperation(list);
        }
    }
}
