package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqrt.csv")
    public void testNumberSQR(int startRange, int endRange, int expected) {
        SQRService service = new SQRService();
        int actual = service.NumberSQR(startRange, endRange);
        Assertions.assertEquals(expected, actual);

    }
}


