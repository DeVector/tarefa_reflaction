import br.com.devector.Tabela;
import br.com.devector.TabelaAnnotation;

import java.lang.reflect.Field;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws NoSuchFieldException {

        Tabela tabela = new Tabela();
        Class instClass = tabela.getClass();

        Field[] fields = instClass.getDeclaredFields();

        for (Field field1 : fields){
            TabelaAnnotation fieldName = field1.getAnnotation(TabelaAnnotation.class);
            System.out.println("Nome da anotação: " + fieldName.nomeDaTabela().toString());
        }

    }
}