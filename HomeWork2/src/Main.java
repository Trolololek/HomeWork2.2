public class Main {
    static double telescope = 14000;
    static double account = 1000;
    static double Scholarship = 2500;
    static double BankProcentMonth = 5;

    static int countMonth = 0;

    public static void main(String[] args) {
        while (account < telescope){

        countMonth++;
        account += Scholarship;}
        System.out.println("Количество месяцев " +countMonth);
    }

}
