package center.rodrigo.core;

import java.security.MessageDigest;

public class HashSHA2_HEX { 
	
    public String codificar(String texto) {
        
        try {
            
            MessageDigest algorithm = MessageDigest.getInstance("SHA-256"); 
            byte messageDigest[] = algorithm.digest(texto.getBytes("UTF-8"));
            StringBuilder hexString = new StringBuilder();
            
            for (byte b : messageDigest) { 
                hexString.append(String.format("%02X", 0xFF & b)); 
            }
            
            return hexString.toString();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
