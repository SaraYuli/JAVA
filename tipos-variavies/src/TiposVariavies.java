public class TiposVariavies{
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;

        soma();
    }

    public static void soma() {
   int numero1 = 2;
   int numero2 = 4;
   int soma = numero1 + numero2;

   System.out.println("A soma de " + numero1 + " e " + numero2 + " é: " + soma);
    
    lojavirtual();

}

    public static void lojavirtual() {
        //Informações do produtos 

         String nomeProduto = "Quadro";
         double precoUnitario = 30;
         int quantidade = 10; // Quantidade desejada pelo cliente 
         int estoqueDisponivel = 100; // Quantida disponível no estoque
         boolean disponivel = estoqueDisponivel >= quantidade; // Verifica se há estoque suficiente

        // Exibição das informações do produto
   
        System.out.println("📦 Produto: " + nomeProduto);
        System.out.println("💰 Preço Unitário: R$ " + precoUnitario);
        System.out.println("📦 Quantidade desejada: " + quantidade);
        System.out.println("📦 Estoque disponível: " + estoqueDisponivel);

        // Verificação de estoque 

        if (!disponivel) {
            System.out.println("❌Erro: Estoque insuficiente! Compra não realizada.");
        } else {
            // Cálculo do total da compra 

            double totalCompra = precoUnitario * quantidade;

            // Verificando do desconto 

            double desconto = 0;
            if (totalCompra > 100) {
                desconto = totalCompra * 0.10; // 10% de desconto
                
            } 

            double totalFinal = totalCompra - desconto; // valor final com desconto
        
        // Exibir valores
        System.out.println("✅ Disponível em estoque: Sim ");
        System.out.println("💲 Valor total da Compra: R$ " + totalCompra);

        if (desconto > 0) {
            System.out.println("🎉 Desconto aplicado: R$ " + desconto);
            System.out.println("💲 Valor Final com Desconto: R$ " + totalFinal);
        }
    }
        }

    }      
   

   

