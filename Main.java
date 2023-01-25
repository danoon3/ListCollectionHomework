import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> goods = new ArrayList<>();
        AddOperation addOperation = new AddOperation();
        ShowOperation showOperation = new ShowOperation();

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

            int numberOfOperation = Integer.parseInt(input);
            switch(numberOfOperation){
                case(1):
                    addOperation.addOperation(goods);
                    break;
                case(2):
                    showOperation.showGoods(goods);
                    break;
            }
        }
    }
}