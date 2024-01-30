package org.somethings;

public class justForTest {
    public static void main(String[] args) {
        //
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        //
        int moneysAccount = 0;
        int cntMonth = 0;
        for (int month = 1; month <= 12; month++) {
            if (moneysAccount < threshold) {
                moneysAccount = moneysAccount + (income - expenses);
            } else {
                cntMonth++;
                moneysAccount = (moneysAccount - expenses) / 3;
            }
            System.out.println("Месяц = " + month + "  ;Кол-во отдыха = " + cntMonth + "  ;Денег на счете = " + moneysAccount);
        }

    }
}
