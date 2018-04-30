
package perceptron;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Miguel Angel Cotrina Espinoza
 * Universidad Tecnologica del Peru
 * Correo: 0820832@utp.edu.pe
 */
public class Perceptron {

    
    public static void main(String[] args) {
        //Ejemplo display
        //System.out.println("Ejercicio Display");
        //neuronaDisplay();
        //Ejemplo AND
        System.out.println("Ejercicio AND");
        neuronaAndOr(1);
        //System.out.println("Ejercicio OR");
        //Ejemplo OR
        //neuronaAndOr(2);
    }
    public static void neuronaAndOr(int tipo){
        /*
            NEURONA ENTRENADA AND Y OR
        */
        //valores esperados OR
            List<Double> valoresEsperadoOR = new ArrayList<>();
            valoresEsperadoOR.add(0.0);
            valoresEsperadoOR.add(1.0);
            valoresEsperadoOR.add(1.0);
            valoresEsperadoOR.add(1.0);
        //valores esperados AND
            List<Double> valoresEsperadoAND = new ArrayList<>();
            valoresEsperadoAND.add(0.0);
            valoresEsperadoAND.add(0.0);
            valoresEsperadoAND.add(0.0);
            valoresEsperadoAND.add(1.0); 
            
         List<Double> valoresTomados = new ArrayList<>(); 
         if(tipo==1){
             valoresTomados=valoresEsperadoAND;
         }else{
             valoresTomados=valoresEsperadoOR;
         }
        //Todos los valores de entrada
            List<Double> entrada1 = new ArrayList<>();entrada1.add(0.0); entrada1.add(0.0);
            List<Double> entrada2 = new ArrayList<>();entrada2.add(0.0); entrada2.add(1.0);
            List<Double> entrada3 = new ArrayList<>();entrada3.add(1.0); entrada3.add(0.0);
            List<Double> entrada4 = new ArrayList<>();entrada4.add(1.0); entrada4.add(1.0);
            List<List<Double>> entrada = new ArrayList<>();entrada.add(entrada1);entrada.add(entrada2);entrada.add(entrada3);entrada.add(entrada4);

        //Creamos al entrenador
            Trainer trainer = new Trainer();
        //Creamos la neurona tamaño 2
            Neuron neurona2 = new Neuron(2);
        //Entrenamos la neurona
            neurona2 = trainer.train(neurona2, entrada, valoresTomados,100);
        //Cargamos los valores de prueba (0 1) Respuesta esperada para AND 0
        //Cargamos los valores de prueba (0 1) Respuesta esperada para OR 1
            List<Double> valoresX1 = new ArrayList<>();
            valoresX1.add(0.0);
            valoresX1.add(1.0);
            neurona2.setX(valoresX1);
        //Mostramos la salida
        System.out.println(neurona2.toString());
        System.out.println(neurona2.sinapsis());
    }
    
    public static void neuronaEjemplo(){
        
        /*
            NEURONA CREADA CON VALORES PREDIFINIDOS
        */
        //Creamos los valores de ejemplo para un OR
            List<Double> valoresX = new ArrayList<>();valoresX.add(1.0);valoresX.add(1.0);
            List<Double> valoresW = new ArrayList<>();valoresW.add(1.2889320280105174);valoresW.add(0.8934602762111035);
        //Creamos una neurona de tamaño 2
            Neuron neurona1 = new Neuron(2);
        //Cargamos los valores de prueba
            neurona1.setX(valoresX);
            neurona1.setW(valoresW);
            neurona1.setPolarizacion(-0.5898267090268952);
        //Mostramos el contenido y la salida
            System.out.println(neurona1.toString());
            System.out.println(neurona1.sinapsis());
        
    }
    public static void neuronaDisplay(){
        /*
            NEURONA ENTRENADA DE DISPLAY
                 
                 a
                 _
             b  |_|  c
                 d
             e  |_|  f
                 g
        */
        //Valor 1 esperado para los numeros impares 1,3,5,7,9
        List<Double> valoresEsperadoDP = new ArrayList<>();
        valoresEsperadoDP.add(0.0);
        valoresEsperadoDP.add(1.0);
        valoresEsperadoDP.add(0.0);
        valoresEsperadoDP.add(1.0);
        valoresEsperadoDP.add(0.0);
        valoresEsperadoDP.add(1.0);
        valoresEsperadoDP.add(0.0);
        valoresEsperadoDP.add(1.0);
        valoresEsperadoDP.add(0.0);
        valoresEsperadoDP.add(1.0);
        
        //Todos los valores de entrada
        List<Double> entrada0a = new ArrayList<>();
                entrada0a.add(1.0); 
        entrada0a.add(1.0);entrada0a.add(1.0);
                entrada0a.add(0.0); 
        entrada0a.add(1.0);entrada0a.add(1.0);
                entrada0a.add(1.0);
        List<Double> entrada1a = new ArrayList<>();
                entrada1a.add(0.0); 
        entrada1a.add(0.0);entrada1a.add(1.0);
                entrada1a.add(0.0); 
        entrada1a.add(0.0);entrada1a.add(1.0);
                entrada1a.add(0.0);
        List<Double> entrada2a = new ArrayList<>();
                entrada2a.add(1.0); 
        entrada2a.add(0.0);entrada2a.add(1.0);
                entrada2a.add(1.0); 
        entrada2a.add(1.0);entrada2a.add(0.0);
                entrada2a.add(1.0);
        List<Double> entrada3a = new ArrayList<>();
                entrada3a.add(1.0); 
        entrada3a.add(0.0);entrada3a.add(1.0);
                entrada3a.add(1.0); 
        entrada3a.add(0.0);entrada3a.add(1.0);
                entrada3a.add(1.0);
        List<Double> entrada4a = new ArrayList<>();
                entrada4a.add(0.0); 
        entrada4a.add(1.0);entrada4a.add(1.0);
                entrada4a.add(1.0); 
        entrada4a.add(0.0);entrada4a.add(1.0);
                entrada4a.add(0.0);
        List<Double> entrada5a = new ArrayList<>();
                entrada5a.add(1.0); 
        entrada5a.add(1.0);entrada5a.add(0.0);
                entrada5a.add(1.0); 
        entrada5a.add(0.0);entrada5a.add(1.0);
                entrada5a.add(1.0); 
        List<Double> entrada6a = new ArrayList<>();
                entrada6a.add(1.0); 
        entrada6a.add(1.0);entrada6a.add(0.0);
                entrada6a.add(1.0); 
        entrada6a.add(1.0);entrada6a.add(1.0);
                entrada6a.add(1.0);                 
        List<Double> entrada7a = new ArrayList<>();
                entrada7a.add(1.0); 
        entrada7a.add(0.0);entrada7a.add(1.0);
                entrada7a.add(0.0); 
        entrada7a.add(0.0);entrada7a.add(1.0);
                entrada7a.add(0.0);  
        List<Double> entrada8a = new ArrayList<>();
                entrada8a.add(1.0); 
        entrada8a.add(1.0);entrada8a.add(1.0);
                entrada8a.add(1.0); 
        entrada8a.add(1.0);entrada8a.add(1.0);
                entrada8a.add(1.0);    
        List<Double> entrada9a = new ArrayList<>();
                entrada9a.add(1.0); 
        entrada9a.add(1.0);entrada9a.add(1.0);
                entrada9a.add(1.0); 
        entrada9a.add(0.0);entrada9a.add(1.0);
                entrada9a.add(1.0);                     
        List<List<Double>> entradaa = new ArrayList<>();
        entradaa.add(entrada0a);
        entradaa.add(entrada1a);
        entradaa.add(entrada2a);
        entradaa.add(entrada3a);
        entradaa.add(entrada4a);
        entradaa.add(entrada5a);
        entradaa.add(entrada6a);
        entradaa.add(entrada7a);
        entradaa.add(entrada8a);
        entradaa.add(entrada9a);
        
        //Creamos al entrenador
            Trainer trainer2 = new Trainer();
        //Creamos la neurona tamaño 2
            Neuron neurona3 = new Neuron(7);
        //Entrenamos la neurona
            neurona3 = trainer2.train(neurona3, entradaa, valoresEsperadoDP,100);
        //Cargamos los valores de prueba 3 : Salida esperada 0 
            List<Double> valoresX2 = new ArrayList<>();
                    valoresX2.add(0.0);
            valoresX2.add(1.0); valoresX2.add(1.0);
                    valoresX2.add(1.0);
            valoresX2.add(0.0); valoresX2.add(1.0);
                    valoresX2.add(1.0);

            neurona3.setX(valoresX2);
        //Mostramos la salida
        System.out.println(neurona3.toString());
        System.out.println(neurona3.sinapsis());
    }
    
}
