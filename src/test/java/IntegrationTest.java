import com.company.textanalysis.model.Check;
import com.company.textanalysis.model.Count;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegrationTest {
    Check check = new Check();
    Count count = new Count();

    @Test
    void integrationTest1() {
        String text = "Maven Good Jobs";
        assertEquals(true, check.determine(text));
        assertEquals("Counting vowels and consonants:\n" + "Vowels: 5 {1=a, 2=e, 3=o, 4=o, 5=o}\n" + "Consonants: 8 {1=M, 2=v, 3=n, 4=G, 5=d, 6=J, 7=b, 8=s}", count.identify(text));
    }

    @Test
    void integrationTest2() {
        String text = "audi";
        assertEquals(true, check.determine(text));
        assertEquals("Counting vowels and consonants:\n" + "Vowels: 3 {1=a, 2=u, 3=i}\n" + "Consonants: 1 {1=d}", count.identify(text));
    }

    @Test
    void integrationTest3() {
        String text = "Java";
        assertEquals(true, check.determine(text));
        assertEquals("Counting vowels and consonants:\n" + "Vowels: 2 {1=a, 2=a}\n" + "Consonants: 2 {1=J, 2=v}", count.identify(text));
    }
}
