// Exemplo de herança usando a classe Animal
public class Executar {
    public static void main(String[] args) {
        Papagaio ppg = new Papagaio("Roberto");
        ppg.falar();
        alimentar(ppg);
        
        Urubu urb = new Urubu("Mengo");   
        urb.torcerProMengo();
        urb.locomover();

        PicaPau pcp = new PicaPau("Gugu", "Vasco");
        pcp.jogarBola();

        Animal gato = new Gato("Tom");
        // gato.cacar(); não existe pois o gato é do tipo Animal, não Gato
        alimentar(gato);
        gato.dormir();


    }

    
    static void alimentar(Animal animal){
        System.out.println("Alimentando o "+animal.getEspecie()+" "+animal.getNome());

    }
}
