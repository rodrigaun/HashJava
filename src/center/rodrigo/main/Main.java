package center.rodrigo.main;

import center.rodrigo.core.HashMD5;
import center.rodrigo.core.HashSHA2;
import center.rodrigo.core.HashSHA2_HEX;

public class Main {

    public static void main(String[] args) {

        String texto = "Hello World";
        
        HashMD5 md5 = new HashMD5();
        System.out.println("MD5:\n" + md5.codificar(texto));
        
        HashSHA2 sha2 = new HashSHA2();
        System.out.println("\nSHA2:\n" + sha2.codificar(texto));
        
        HashSHA2_HEX sha2Hex = new HashSHA2_HEX();
        System.out.println("\nSHA2_HEX:\n" + sha2Hex.codificar(texto));

    }
}
