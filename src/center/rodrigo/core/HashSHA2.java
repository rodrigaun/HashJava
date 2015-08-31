package center.rodrigo.core;

import java.security.MessageDigest;

public class HashSHA2 { 
	
    public String codificar(String texto) {
        
        try {
            
            MessageDigest algorithm = MessageDigest.getInstance("SHA-256"); 
            return new String(algorithm.digest(texto.getBytes("UTF-8"))); 
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}