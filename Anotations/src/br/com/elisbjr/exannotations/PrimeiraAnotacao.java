package br.com.elisbjr.exannotations;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface PrimeiraAnotacao {
    String value();
}
