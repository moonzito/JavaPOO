public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.status();
        c1.tampar();
        c1.rabiscar();

        for(int i=0;i<10;i++){
            System.out.println(" ");
        }

        Caneta c2 = new Caneta();
        c2.cor = "Vermelho";
        c2.ponta = 1.5F;
        c2.tampada = true;
        c2.status();
        c2.destampar();
        c2.rabiscar();
    }
}
