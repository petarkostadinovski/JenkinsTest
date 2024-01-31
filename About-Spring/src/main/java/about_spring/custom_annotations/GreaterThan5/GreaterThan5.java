package about_spring.custom_annotations.GreaterThan5;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = GreaterThan5Validator.class)
public @interface GreaterThan5 {

    String message() default "The number should be greater than 5";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
