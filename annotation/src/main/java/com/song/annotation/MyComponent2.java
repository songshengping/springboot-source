package com.song.annotation;

import java.lang.annotation.*;

/**
 * {@link MyComponent} 派生注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@MyComponent
public @interface MyComponent2 {
}
