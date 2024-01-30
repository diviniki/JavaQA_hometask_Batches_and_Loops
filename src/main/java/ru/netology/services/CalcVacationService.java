//Создаем пакет по схеме: groupId + artifactId (но иерархия может быть любой, в зависимости от нашей структуры проекта)
package ru.netology.services;

// Чтобы нее вводить каждый раз полное название сервиса, нужно его импортировать
//import ru.netology.services.CalcVacationServiceTest;
public class CalcVacationService {
    public int CntMonthOfVacation(int income, int expenses, int threshold) {
        int moneysAccount = 0;
        int cntMonth = 0;
        for (int month = 1; month <= 12; month++) {
            if (moneysAccount < threshold) {
                moneysAccount = moneysAccount + (income - expenses);
            } else {
                cntMonth++;
                moneysAccount = (moneysAccount - expenses) / 3;
            }
        }
        return cntMonth;
    }
}
