package acme;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.security.NoSuchAlgorithmException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("App class tests")
public class AppTest {
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Nested
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    @DisplayName("calculateMd5Hash method tests")
    class CalculateMd5HashTest {
        private Stream<Arguments> data() {
            return Stream.of(
                    arguments("", "D41D8CD98F00B204E9800998ECF8427E"),
                    arguments("password", "5F4DCC3B5AA765D61D8327DEB882CF99")
            );
        }

        @ParameterizedTest
        @MethodSource("data")
        void calculateMd5Hash(String password, String expected) throws NoSuchAlgorithmException {
            assertEquals(expected, App.calculateMd5Hash(password));
        }
    }
}
