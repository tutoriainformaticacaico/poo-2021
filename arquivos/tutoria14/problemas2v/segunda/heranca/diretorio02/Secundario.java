// para compilar este arquivo, saia do package que está e use o seguinte comando (sem as /):
// javac nomedapasta/Secundario.java
// substituindo o nomedapasta pelo nome da pasta que está a classe Secundario
import diretorio01.Animal; // certifique-se que o sua classe Animal está numa pasta chamada diretorio01 e tenha o correto package
public class Secundario{
    public static void main(String[] args) {
        Animal a = new Animal();
        // não acessa nome pois nome é protected e Secundario está em outra pasta/pacote
        System.out.println(a.nome);
    }
}
