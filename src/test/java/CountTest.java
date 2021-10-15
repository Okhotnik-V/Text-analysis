import com.company.textanalysis.model.Count;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountTest {
    Count count = new Count();

    @Test
    void identifyTest() {
        assertEquals("Counting vowels and consonants:\n" + "Vowels: 1 {1=i}\n" + "Consonants: 2 {1=D, 2=n}", count.identify("Din"));
        assertEquals("Counting vowels and consonants:\n" + "Vowels: 3 {1=a, 2=e, 3=U}\n" + "Consonants: 6 {1=G, 2=r, 3=d, 4=l, 5=B, 6=M}", count.identify("Gradle BUM"));
        assertEquals("Counting vowels and consonants:\n" + "Vowels: 5 {1=a, 2=e, 3=o, 4=o, 5=o}\n" + "Consonants: 8 {1=M, 2=v, 3=n, 4=G, 5=d, 6=J, 7=b, 8=s}", count.identify("Maven Good Jobs"));
    }
}