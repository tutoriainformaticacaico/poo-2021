public class Principal {
    public static void main(String[] args) {
        Serie s1 = new Serie();
        s1.setNome("Diarios de Um Programador");
        s1.setCategoria("Terror");
        s1.setFaixaEtaria("Livre");






        
        Episodio[] epsT1S1 = new Episodio[2]; 
        epsT1S1[0] = new Episodio("Piloto", 50);       
        epsT1S1[1] = new Episodio("Inicio de um sonho");






        Temporada[] tempsS1 = new Temporada[1];
        tempsS1[0] = new Temporada(epsT1S1);
        
        
        s1.setTemporadas(tempsS1);

        System.out.println("Episodios: "+s1.getTemporadas()[0].getEpisodios()[0].getNome());        
    }
}
