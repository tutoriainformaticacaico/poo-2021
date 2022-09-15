/*
Questão:
1 - Defina uma estrutura de dados para agrupar e representar 
os dados de um automóvel (marca do fabricante, modelo, 
ano de fabricação e quantidade máxima de passageiros)
*/

// Nessa questão só era necessário criar o registro no arquivo "Automovel.java".
// Não era necessário instanciar objeto, atribuir valores ou imprimir os valores (como feito nesse arquivo).
class Questao01 {
    public static void main(String[] args) {
        Automovel automovel1 = new Automovel(); // Instanciando um objeto do tipo Automovel nomeado automovel1
        automovel1.marca = "Volkswagen"; // Atribuindo valor à variável "marca" do registro Automovel
        // Atribuindo valores às demais variáveis
        automovel1.modelo = "Modelo1231"; 
        automovel1.ano = 2019;
        automovel1.qtdMaxPassageiros = 5;

        // Imprimindo os dados do registro
        System.out.println(" --- Informacoes sobre o automovel --- ");
        System.out.println("Marca: "+automovel1.marca);
        System.out.println("Modelo: "+automovel1.modelo);
        System.out.println("Ano de fabricacao: "+automovel1.ano);
        System.out.println("Quantidade maxima de passageiros: "+automovel1.qtdMaxPassageiros);

    }
}