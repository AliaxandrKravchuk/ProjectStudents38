package test.com.lesson3Project.HM_project;

import com.lesson3Project.model.Teacher;
import org.junit.Test;

import static org.junit.Assert.*;

public class TeacherTest {

    Teacher teacher1;

    @org.junit.Before
    public void setUp() throws Exception {
        teacher1 = new Teacher("A", "Sa", 10, 1000, 30, null);
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("Test end");
    }

    @org.junit.Test
    public void zpm() {

        int pay = 100;
        int summ = 30;
        teacher1.setPay(pay);
        teacher1.setHour(summ);
        int rezalt = pay * summ;
        int realRezalt = teacher1.zpm();

        assertTrue("fallZpm", rezalt == realRezalt);
    }

    @Test
    public void setAgeWithZero() {
        int age = 10;
        teacher1.setAge(-40);
        int rezAge = age;
        int realAge = teacher1.getAge();

        assertTrue("fallAge", rezAge == realAge);
    }
}