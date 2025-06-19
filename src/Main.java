import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] products = {"Хлеб", "Яблоки 1 кг", "Молоко", "Пиво Балтика 9", "Чипсы 'Русская картошка' 100 грамм"};
        int[] prices = {100, 200, 130, 60, 80};
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + " " + prices[i] + " рублей.");
        }
        double Summ = 0; //цена всей корзины
        System.out.println("Введите номер товара и его количество через пробел. Введите для завершения" +
                " команду end, для очистки корзины команду clr");
        while (true) {
            Scanner input = new Scanner(System.in);
            String inputString = input.nextLine();
            if (inputString.equals("end")) {
                break;
            }
            if (inputString.equals("clr")) {
                Summ = 0;
                System.out.println("Сумма корзины " + Summ);
                continue;
            }
            String[] line = inputString.split(" ");
            int productNumber = Integer.parseInt(line[0]);
            int productCount = Integer.parseInt(line[1]);
            Summ = Summ + productCount * prices[productNumber - 1];
            System.out.println("Сумма корзины " + Summ);
        }

    }
}