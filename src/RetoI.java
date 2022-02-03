import java.io.IOException;
import java.util.Scanner;

public class RetoI {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String texto;
        int codigo;
        //Introducir un texto
        do {
            System.out.print("Introduce un texto: ");
            texto = sc.nextLine();
        } while (texto.isEmpty());
        //Introducir el valor del desplazamiento
        do {
            System.out.print("Introduce el código: ");
            codigo = sc.nextInt();
        } while (codigo < 1);
        
        System.out.println("Texto cifrado: " + cifradoCesar(texto, codigo));
        
    }

    //método para cifrar el texto
    public static String cifradoCesar(String texto, int codigo) {
        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        for (int i = 0; i < texto.length(); i++) {
            if ((texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') || (texto.charAt(i) >= '0' && texto.charAt(i) <= '9') || texto.charAt(i) ==' ' || texto.charAt(i) ==',') {
                    cifrado.append((char) (texto.charAt(i)));
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) + codigo) > 'Z') {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            }
        }
        return cifrado.toString();
    }

} //Fin cifrado Cesar