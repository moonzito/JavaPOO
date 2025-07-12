public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        p.nome = "Joaozinho";
        p.peso = 67.5F;
        p.altura = 1.45F;
        p.idade = 12;

        p.parado();
        p.acao();
    }
}
