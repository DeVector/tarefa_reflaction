package br.com.devector;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface TabelaAnnotation {

    String nomeTabela();

}
