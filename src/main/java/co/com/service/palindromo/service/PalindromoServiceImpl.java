package co.com.service.palindromo.service;

import co.com.service.palindromo.dto.Palindromo;
import org.springframework.stereotype.Service;

@Service
public class PalindromoServiceImpl implements PalindromoService{

    public Palindromo encontrarMayorPalindromo(String cadena){

        Palindromo mayorPalindromo = new Palindromo();

        String[] parts = cadena.split(" ");
        String palindromo = "";

        for(int i = 0; i < parts.length; i++) {

            String cadenaInicial = parts[i];

            StringBuilder strb = new StringBuilder(cadenaInicial);
            String cadenaReversa = strb.reverse().toString();

            if (cadenaReversa.equals(cadenaInicial)) {
                if (cadenaReversa.length() > palindromo.length()) {
                    palindromo = cadenaReversa;
                }
            } else {
                //EVALUA SEGUN LA PALABRA NORMAL
                for (int j = 0; j < cadenaReversa.length(); j++) {

                    String cadenaValue = parts[i].substring(j);

                    StringBuilder strb2 = new StringBuilder(cadenaValue);
                    String recorteReversa = strb2.reverse().toString();

                    if (recorteReversa.equals(cadenaValue)) {
                        if (recorteReversa.length() > palindromo.length()) {
                            palindromo = recorteReversa;
                        }
                    }
                }

                //EVALUA SEGUN LA PALABRA INVERTIDA
                for (int x = 0; x < cadenaReversa.length(); x++) {

                    String cadenaValue = cadenaReversa.substring(x);

                    StringBuilder strb2 = new StringBuilder(cadenaValue);
                    String recorteReversa = strb2.reverse().toString();

                    if (recorteReversa.equals(cadenaValue)) {
                        if (recorteReversa.length() > palindromo.length()) {
                            palindromo = recorteReversa;
                        }
                    }
                }
            }
        }

        mayorPalindromo.setResultado(palindromo);

        return mayorPalindromo;
    }

}
