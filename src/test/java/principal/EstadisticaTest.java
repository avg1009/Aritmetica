package principal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.naming.NameNotFoundException;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class EstadisticaTest {
    private Double[] conjuntoTest1 = {1.4, 3.0, 2d, 1d, 0d};
    private Double[] conjuntoTest2 = {1d};
    private Double[] conjuntoTest3 = {-5d,-2d,-1d,-3d};
    private Double[] conjuntoTest4 = {3d,3d,3d,3d,3d};
    private Double[] conjuntoTestVacio = {};
    private Double[] conjuntoTestNull = {null,null,null};
    private Double[] conjuntoTestCeros = {0d,0d,0d,0d,0d};
    static Estadistica objetoEstadistica ;
    @BeforeAll
    static void initAll(){
         objetoEstadistica = new Estadistica();
    }
    @Test
    @DisplayName("Test de la media")
    void media() {
        System.out.println("Primero conjunto: "+conjuntoTest1);
        System.out.println("La media del conjunto es: "+Estadistica.media(conjuntoTest1));
        assertEquals(1.48,Estadistica.media(conjuntoTest1));

        System.out.println("Segundo conjunto: "+conjuntoTest2);
        System.out.println("La media del conjunto es: "+Estadistica.media(conjuntoTest2));
        assertEquals(1,Estadistica.media(conjuntoTest2));

        System.out.println("Tercer conjunto: "+conjuntoTest3);
        System.out.println("La media del conjunto es: "+Estadistica.media(conjuntoTest3));
        assertEquals(-2.75,Estadistica.media(conjuntoTest3));

        System.out.println("Cuarto conjunto: "+conjuntoTest4);
        System.out.println("La media del conjunto es: "+Estadistica.media(conjuntoTest4));
        assertEquals(3,Estadistica.media(conjuntoTest4));

        System.out.println("Quinto conjunto: "+conjuntoTestVacio);
        System.out.println("La media del conjunto es: "+Estadistica.media(conjuntoTestVacio));
        assertThrows(NullPointerException,Estadistica.media(conjuntoTestVacio));


        System.out.println("Sexto conjunto: "+conjuntoTestNull);
        System.out.println("La media del conjunto es: "+Estadistica.media(conjuntoTestNull));
        assertEquals(null,Estadistica.media(conjuntoTestNull));

        System.out.println("Septimo conjunto: "+conjuntoTestCeros);
        System.out.println("La media del conjunto es: "+Estadistica.media(conjuntoTestCeros));
        assertEquals(0,Estadistica.media(conjuntoTestCeros));



    }

    @Test
    @DisplayName("Test de la varianza")
    void varianza() {
    }

    @Test
    @DisplayName("Test de la desviación tipica")
    void desviacionTipica() {
    }
}