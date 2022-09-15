/*
Questão:
2 - Escreva um programa que armazene os dados relacionados 
a um filme (nome, autor, ano, preço) em uma estrutura 
de dados do tipo registro. Crie funções para ler e para 
imprimir os dados desse tipo de registro. Crie uma função 
main para ler e imprimir os dados de 3 diferentes filmes.

*/

class Questao02 {
    public static void main(String[] args) {
        Filme f1 = new Filme(); // Instancia um objeto do tipo Filme chamado de f1
        f1.lerDados(); // Chama a função de lerDados que está contida na classe Filme (somente lê os dados do filme f1)
        f1.mostrarDados(); // Chama a função de mostrarDados que está contida na classe Filme (somente mostra os dados do filme f1)

        Filme f2 = new Filme(); // Instancia um objeto do tipo Filme chamado de f2
        f2.lerDados(); // Chama a função de lerDados que está contida na classe Filme (somente lê os dados do filme f2)
        f2.mostrarDados(); // Chama a função de mostrarDados que está contida na classe Filme (somente mostra os dados do filme f2)

        Filme f3 = new Filme(); // Instancia um objeto do tipo Filme chamado de f3
        f3.lerDados(); // Chama a função de lerDados que está contida na classe Filme (somente lê os dados do filme f3)
        f3.mostrarDados(); // Chama a função de mostrarDados que está contida na classe Filme (somente mostra os dados do filme f3)

    }
}