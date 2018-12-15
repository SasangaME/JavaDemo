package tutorial.annotations;

import java.lang.annotation.*;

@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SmartPhone {
    String os() default "Nuget";
    int version() default  7;
}


