import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> goods = new ArrayList<>();
        GoodsOperations goodsOperations = new GoodsOperations();
        int numberOfOperation = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Добрый день!\n" +
                "Доступные операции:\n" +
                "1. Добавить покупку\n" +
                "2. Показать список покупок\n" +
                "3. Удалить покупку\n");
        while (true) {
            System.out.println("Выберите операцию:");
            String input = scanner.nextLine();

            if (input.equals("end")) {
                System.out.println("Доброго дня!");
                break;
            }
            try {
                numberOfOperation = Integer.parseInt(input);
            } catch (NumberFormatException ex) {
                System.out.println("Вам необходимо ввести номер операции :)\n");
                continue;
            }
            switch (numberOfOperation) {
                case (1):
                    goodsOperations.addOperation(goods);
                    break;
                case (2):
                    goodsOperations.showOperation(goods);
                    break;
                case (3):
                    goodsOperations.deleteOperation(goods);
                    break;
                case (4):
                    goodsOperations.findOperation(goods);
                    break;
                default:
                    break;
            }
        }
    }
}
