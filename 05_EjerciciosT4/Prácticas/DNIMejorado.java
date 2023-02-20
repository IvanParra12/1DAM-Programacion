package daw.persona;

import daw.persona.*;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class DNIMejorado {

    //ATRIBUTOS
    private int numero;
    private char letra;

    //CONSTRUCTORES
    public DNIMejorado(int n) {
        numero = n;
        letra = this.calcularLetra(n);
    };
    
    //GETTERS
    public int getNumero() {
        return this.numero;
    }
    
    public int getLetra() {
        return this.letra;
    }
    private char calcularLetra(int n) {
        int resto = n % 23;
        char letra = ' ';

        switch (resto) {
            case 0:
                letra = 'T';
                break;
            case 1:
                letra = 'R';
                break;
            case 3:
                letra = 'W';
                break;
            case 4:
                letra = 'A';
                break;
            case 5:
                letra = 'G';
                break;
            case 6:
                letra = 'M';
                break;
            case 7:
                letra = 'Y';
                break;
            case 8:
                letra = 'F';
                break;
            case 9:
                letra = 'P';
                break;
            case 10:
                letra = 'X';
                break;
            case 11:
                letra = 'B';
                break;
            case 12:
                letra = 'N';
                break;
            case 13:
                letra = 'J';
                break;
            case 14:
                letra = 'Z';
                break;
            case 15:
                letra = 'S';
                break;
            case 16:
                letra = 'Q';
                break;
            case 17:
                letra = 'V';
                break;
            case 18:
                letra = 'H';
                break;
            case 19:
                letra = 'L';
                break;
            case 20:
                letra = 'C';
                break;
            case 21:
                letra = 'K';
                break;
            case 22:
                letra = 'E';
                break;
        }
        return letra;
    }
    @Override
    public String toString() {
        String aux = String.valueOf(this.numero) + 
                String.valueOf(this.letra);
        
        return aux;
    }
}
