import org.junit.Test;

import java.util.Optional;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class JavaOptionalTest{

    @Test
    public void whenCreatesEmptyOptional_thenCorrect(){
        Optional<String> empty = Optional.empty();
        assertFalse(empty.isPresent());
    }

    @Test
    public void givenNonNull_whenCreatesNonNullable_thenCorrect(){
        String name = "aditya";
        Optional<String> opt = Optional.of(name);
        assertTrue(opt.isPresent());
    }

    @Test(expected = NullPointerException.class)
    public void givenNull_whenThrowsErrorOnCreate_theCorrect(){
        String name = null;
        Optional.of(name);
    }

    public void givenNonNull_withCreatesNullable_thenCorrect(){
        String name = "aditya";
        Optional<String> opt = Optional.ofNullable(name);
        assertTrue(opt.isPresent());
    }


}
