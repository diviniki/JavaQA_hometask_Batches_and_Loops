import ru.netology.services.CalcVacationService;

public class Main {
    public static void main(String[] args) {
        CalcVacationService service = new CalcVacationService();
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int cntMonth = service.CntMonthOfVacation(income, expenses, threshold);
        System.out.println(cntMonth);
    }
}