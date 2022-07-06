public class Main {
    public static void main(String[] args) {
        System.out.println("Здравствуйте!");
        System.out.println("Введите сумму средств на счете до пополнения и сумму пополнения");

        int summaPopolnenia = 0;
        int accountАmount = 0;
        int schet = summaPopolnenia + accountАmount;
        int bonus = schet / 100;
        if (schet < 1000) {
            System.out.println("Для начисления бонусных рублей на счете должно быть не менее 1000 рублей");
        } else {
            System.out.println(bonus+schet +" рублей");
        }
        System.out.println("До свидания!");
    }
}
