package about_spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.net.URI;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        classes = AboutSpringApplication.class
)
public class TestControllerIT {

    @Autowired
    TestRestTemplate testRestTemplate;

    @Test
    void test() {
        ResponseEntity<Void> response = testRestTemplate.exchange(
                URI.create("/api/test"),
                HttpMethod.GET,
                null,
                Void.class
        );

        assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
    }

}
