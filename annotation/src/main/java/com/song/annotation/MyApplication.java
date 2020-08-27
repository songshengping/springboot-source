package com.song.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@MyComponent2
@MyConfiguration(name = "myConfiguration")
public @interface MyApplication {
}
