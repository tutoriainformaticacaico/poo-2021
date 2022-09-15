public class Condicionais {
    public static void main(String[] args) {
        int n = 1;
        n += 24;
        n *= 4;
        n = 1001;
        if (n < 100) {
            System.out.println("eh menor que 100");
        } else{

        }

        String nome = "Marlison";
        
        switch (nome) {
            case "Nilza":
                System.out.println("voce eh Nilza!");
                break;
            case "Arthur":
                System.out.println("voce eh Arthur!");
                break;
        
            default:
                System.out.println("voce nao eh nem Nilza, nem Arthur!");
                break;
        }
    }
}
