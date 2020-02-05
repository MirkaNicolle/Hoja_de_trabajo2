import java.io.*;

public class Calculadora implements PostfixCalculator {

    public void importText() throws IOException {
        //lectura de archivo txt
        File file = new File("Datos.txt");
        FileReader fileReader = new FileReader(file);

        //adicion al stack
        Pila<Integer> stack = new Stack<Integer>();
        Pila<Integer> stack2 = new Stack<Integer>();


    }

    public void validateText(String line) {
        for (int position = 0; position < line.length(); ++position) {

            char caracter = line.charAt(position);

            if (Character.isLetter(caracter)) {

                System.out.println("Error en la linea");
                break;
            }
        }
    }

    public int calculate(String line) {
      //
    }

}
