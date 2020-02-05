import java.io.FileNotFoundException;
import java.io.IOException;

//Interface para las operaciones de la calculadora

public interface PostfixCalculator {
    //cada linea es una pocisión del vector
    void importText() throws IOException;

    //valida la expresión dada
    void validateText(String line);

    //Evalua la expresión postfix, devuelve el resultado
    int calculate(String line);
}
