package za.ac.cput.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
private Employee emp1;
private Employee emp2;
private Employee emp3;

public void setUp(){
    emp1 = new Employee("Chenique", "Jacobs",22,"chenique@gmail.com");
    emp2 = new Employee("Chenique", "Jacobs",22,"chenique@gmail.com");
    emp3 = new Employee("Jordy","Meye",23,"jordymeye@gmail.com");


}

@Test
    public void testObjectEquality(){
    assertEquals(emp1, emp2);
    System.out.println("Employee 1 and Employee 2 are equals");
}

@Test
    public void testObjectIdentity(){
    assertNotSame(emp1, emp3);
    System.out.println("Employee 1 and Employee 3 are not the same");
}

@Test
    public void FailingTest(){
    emp1.setAge((25));
    assertEquals(30,emp1.getAge());
}

@Timeout(60)
@Test
    public void Timeouts(){
    emp1= new Employee("Chenique", "Jacobs",22, "cheniquejacobs@gmail.com");
    assertTimeout(Duration.ofSeconds(1),()-> {
        emp1.toString();
    });
}

@Disabled("Disabled")
    @Test
    public void DisablingTest(){
    emp1 = new Employee("Chenique","Jacobs",22,"cheniqujacobs@gmail.com");
    assertEquals(2,1+1);
}

}