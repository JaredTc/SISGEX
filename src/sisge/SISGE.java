
package sisge;


import interfacez.InicioSesion;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
import static sisge.Mysqlconexion.conexion;

public class SISGE {

    public static void main(String[] args) {
//        passwordgenerator();
             java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }
    
    
//    public static void passwordgenerator(){
//                String[] symbols = {"0", "1", "A", "o", "f", "d", "e","R"};
//        int length = 8;
//        Random random;
//        try {
//            random = SecureRandom.getInstanceStrong();
//            StringBuilder sb = new StringBuilder(length);
//            for (int i = 0; i < length; i++) {
//                 int indexRandom = random.nextInt ( symbols.length );
//                 sb.append( symbols[indexRandom] );
//            }
//            String password = sb.toString();
//            System.out.println(password);
//          } catch (NoSuchAlgorithmException e){
//              System.out.println(e.toString());
//          }
//     }
    }
    

