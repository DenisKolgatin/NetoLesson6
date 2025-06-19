import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] products = {"Хлеб", "Яблоки", "Молоко", "Пиво Балтика", "Чипсы 'Русская картошка'"};
        int[] prices = {100, 200, 130, 60, 80};
        int[] allProducts = new int[products.length];
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + " " + prices[i] + " рублей.");
        }
        double summ = 0; //цена всей корзины
        System.out.println("Введите номер товара и его количество через пробел. Введите для завершения" + " команду end, для очистки корзины команду clr");
        while (true) {
            Scanner input = new Scanner(System.in);
            String inputString = input.nextLine();
            if (inputString.equals("end")) {
                break;
            } else if (inputString.equals("clr")) {
                summ = 0;
                for (int i = 0; i < allProducts.length; i++) {
                    allProducts[i] = 0;
                }
            } else {
                String[] line = inputString.split(" ");
                int productNumber = Integer.parseInt(line[0]);
                int productCount = Integer.parseInt(line[1]);
                summ = summ + productCount * prices[productNumber - 1];
                allProducts[productNumber - 1] = allProducts[productNumber - 1] + productCount;
            }

            System.out.println("Всего товаров в корзине: ");
            for (int i = 0; i < products.length; i++) {
                System.out.println(products[i] + " " + allProducts[i] + " штук," + " всего " + prices[i] * allProducts[i] + " рублей.");
            }
            System.out.println("Сумма корзины " + summ + " рублей.");
        }

    }
}