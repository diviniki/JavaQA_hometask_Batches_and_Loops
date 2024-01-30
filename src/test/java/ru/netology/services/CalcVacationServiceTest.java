// !!!  ПРИМЕР С ПАРАМЕТРИЗОВАННЫМ ТЕСТОМ   !!!

//import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
//import org.junit.jupiter.params.provider.CsvSource;
// Чтобы нее вводить каждый раз полное название сервиса, нужно его импортировать
import ru.netology.services.CalcVacationService;

// Создаем пакет по схеме: groupId + artifactId (но иерархия может быть любой, в зависимости от нашей структуры проекта)

public class CalcVacationServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = "datasetForTesting.csv")
    void shouldCalculateCountOfVacationMonthByInputParameters(int expected, int income, int expenses, int threshold) {
        CalcVacationService service = new CalcVacationService();
        // подготавливаем данные:

        // вызываем целевой метод:
        int actual = service.CntMonthOfVacation(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

}


