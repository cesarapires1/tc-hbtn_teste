import java.time.*;
import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {

    Person pessoa;

    @BeforeEach
    public void setup() {
        Year year = Year.of(2000);
        Date date = Date.from(year.atDay(1).atStartOfDay(ZoneId.systemDefault()).toInstant());

        pessoa = new Person("Paul", "McCartney", date, true, true, true);
    }

    @Test
    public void show_full_name() {
        assertEquals("Paul McCartney", pessoa.fullName());
    }

    @Test
    public void test_calculateYearlySalary() {
        pessoa.setSalary(1200);

        assertEquals(14400, pessoa.calculateYearlySalary());
    }

    @Test
    public void person_is_MEI() {
        pessoa.setAnotherCompanyOwner(false);
        pessoa.setPensioner(false);
        pessoa.setPublicServer(false);

        assertTrue(pessoa.isMEI());
    }

    @Test
    public void person_is_not_MEI() {
        pessoa.setAnotherCompanyOwner(true);
        pessoa.setPensioner(true);
        pessoa.setPublicServer(true);

        assertFalse(pessoa.isMEI());
    }

}