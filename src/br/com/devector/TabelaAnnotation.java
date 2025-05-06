package br.com.devector;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface TabelaAnnotation {

    String nomeDaTabela();
}
