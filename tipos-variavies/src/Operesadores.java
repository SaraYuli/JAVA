import javax.swing.event.SwingPropertyChangeSupport;

public class Operesadores{
    public static void main (String[] args){
        int numero = 5;
        
        numero = - numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

      ternário();  
    }
      
    public static void ternário(){

int a, b;

a = 5;
b = 6;

//EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
/* if(a==b)
   resultado = "verdadeiro";
else
   resultado = "falso"; */

//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
String resultado = (a==b) ? "verdadeiro" : "false";

System.out.println(resultado);


     relacionais();
      }

        public static void relacionais(){

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2) {
            System.out.println("A nossa condição é verdadeira");
        } 
        

        System.out.println("O número 1 é igual ao número 2 ? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("O número 1 é diferante do número 2 ? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("O número 1 é maior que o número 2 ? " + simNao);

        logico();
    }
        public static void logico(){

            boolean condicao1 = true;
            boolean condicao2 = false;

            if (condicao1 && condicao2){
                System.out.println("As duas consições sõa verdadeiras");
            }

            System.out.println("Fim");
        }









}