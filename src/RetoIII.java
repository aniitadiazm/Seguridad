
import java.io.IOException;
import java.util.Scanner;

public class RetoIII {

      public static void main(String[] args) throws IOException {
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Texto cifrado: LEGREXIRDRVJLEKVOKFHLVTFEKZVEVKFURJCRJCVKIRJUVCRSVTVURIZFLEVAVDGCFVJTRURMVQHLVKIRSRAFWVCZODVGRXRLENYZJBP");
              
          //Descifrar
          for (int i = 0; i < 300; i++) {
              
              String text = descifrado("LEGREXIRDRVJLEKVOKFHLVTFEKZVEVKFURJCRJCVKIRJUVCRSVTVURIZFLEVAVDGCFVJTRURMVQHLVKIRSRAFWVCZODVGRXRLENYZJBP", i);
              if (text.contains("FELIX")) {
                System.out.println("Texto descifrado: " +text);
                System.out.println("La clave era: " + i);
                break;
              }
            }
          }


    //El mismo método de cifrado que el reto 1, pero llamado de distinta manera para diferenciarlo
    public static String descifrado(String texto, int codigo) {
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
    
    public static String quitarCaracteres(String texto){
      return texto.replaceAll("[^\\dA-Za-z]", "");
      }
     }