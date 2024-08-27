public class Main2 {
    public static void main(String[] args) {
        // Сумма на текущем счету клиента
        int currentBalance = 100;
        // Сумма пополнения
        int topUpAmount = 1100;

        // Рассчитываем итоговую сумму на счету клиента после пополнения
        int totalBalance = currentBalance + topUpAmount;

        // Определяем количество бонусных рублей
        int bonus = 0;
        if (topUpAmount > 1000) {
            bonus = (topUpAmount / 100);
        }


        // Выводим результаты
        System.out.println("Итоговая сумма на счету: " + (totalBalance + bonus));
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}