public class Comentarios {

public static void main(String[] args) {
    //Olá, eu sou um comentário em uma unica linha



    /*Olá
     * Eu sou um comentário
     * que posso ser mais detalhado
     * quando necessário
     */ 

}

 /**
      * Estas duas estrelihas acima
      * é para identificar que você
      * pretende elaborar um comentário
      * a nivel de documentação.
      * Que incrivel !!!
      */

    public void metodo(){

    }   
    
    /*
 * Este método foi elaborado as pressas
 * por isso eu abrevei o nome das variáveis
 * mas olha, ele tem a finalidade somar ou  multiplicar
 * dois números
 */
 
public int somaMultiplica (int n, int x, String m){
    int r = 0; // r é igual ao resultado
    if (m == "M"){ // M= multiplicação
        r= n * x;
    }else{
        // se não soma mesmo
        r = n + x;
    }
    return r;
}


}
