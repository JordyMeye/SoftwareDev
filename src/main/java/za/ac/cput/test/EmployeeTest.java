package za.ac.cput.test;

import za.ac.cput.domain.Employee;

import java.time.Duration;

public class EmployeeTest {
    private Employee emp1;
    private Employee emp2;
    private Employee emp3;

    public void setUp() {
        emp1 = new Employee("John", "Doe", 29);
        emp2 = new Employee("John", "Doe", 29);
        emp3 = new Employee("Jane", "Tim", 26);

    }

    @Test
    public void testObjectEquality() {
        assertEquals(emp1, emp2);
        System.out.println("Employee 1  & Employee 2 are equals");

    }

    @Test
    public void testObjectIdentity() {
        assertNotSame(emp1, emp2);
        System.out.println("Employee 1 & Employee 3 are not the same");

    }

    @Test
    public void FallingTest() {

        emp1.setAge(25);
        assertEquals(30, emp1.getAge());
    }

    @Timeout(60)
    @Test
    public void Timeouts() {
        emp1 = new Employee("John", "Doe", 29);
        assertTimeout(Duration.ofSeconds(1), () -> {
            emp1.toString();
        });
    }

    @Disabled("Disabled")
    @Test
    public void Disablingtest() {
        emp1 = new Employee("John", "Doe", 29);
        assertEquals(2, 1+1);
    }
}
