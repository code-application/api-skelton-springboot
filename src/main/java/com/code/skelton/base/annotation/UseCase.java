package com.code.skelton.base.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

/**
 * Indicates that an annotated class is a "UseCase".
 *
 * <p>
 * May also indicate that a class is a "Application UseCase", or something similar. This annotation
 * is a general-purpose stereotype and individual teams may narrow their semantics and use as
 * appropriate.
 *
 * <p>
 * This annotation serves as a specialization of {@link Component @Component}, allowing for
 * implementation classes to be autodetected through classpath scanning.
 *
 * @author CODE
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface UseCase {
    /**
     * The value may indicate a suggestion for a logical component name, to be turned into a Spring
     * bean in case of an autodetected component.
     * 
     * @return the suggested component name, if any (or empty String otherwise)
     */
    @AliasFor(annotation = Component.class)
    String value() default "";
}
