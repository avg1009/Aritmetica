package principal;

import java.util.*;
import java.lang.*;

public class Estadistica {
    public static double media(Double[] coleccion){
        if (coleccion.length == 0 ){
            throw new NullPointerException();
        }
        double suma=0;
        for(double elemento : coleccion){

            suma += elemento;

        }

        return suma/ coleccion.length;
    }
    public double varianza(Double[] coleccion){
        double media = media(coleccion);
        double sumaCuadrados = 0;
        for(double elementos : coleccion){
            double cuadrado = Math.pow(elementos-media,2);
            sumaCuadrados += cuadrado;
        }
        return sumaCuadrados/ coleccion.length;
    }
    public double desviacionTipica(Double[] coleccion){
        double media = media(coleccion);
        return media;
    }
}
