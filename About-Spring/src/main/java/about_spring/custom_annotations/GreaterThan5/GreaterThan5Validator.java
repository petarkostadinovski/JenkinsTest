package about_spring.custom_annotations.GreaterThan5;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class GreaterThan5Validator implements ConstraintValidator<GreaterThan5, Integer> {
    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        return integer > 5;
    }
}
