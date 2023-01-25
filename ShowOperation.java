import java.util.ArrayList;

public class ShowOperation {
    protected void showGoods(ArrayList<String> list) {
        System.out.println("Список покупок:");
        for(int i = 0; i < list.size(); i++){
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }
}
