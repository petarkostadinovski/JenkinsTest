package about_spring.custom_annotations.GreaterThan5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Number {

    @GreaterThan5
    Integer number;

}
