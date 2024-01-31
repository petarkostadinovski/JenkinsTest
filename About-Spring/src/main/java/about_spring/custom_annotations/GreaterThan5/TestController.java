package about_spring.custom_annotations.GreaterThan5;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @PostMapping
    void testAnnotation(@RequestBody @Valid  Number number) {

    }

}
