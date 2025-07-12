public class Pessoa {
    String nome;
    float peso;
    float altura;
    int idade;
    boolean movimento;

    void andar(){
        this.movimento = movimento;
        this.movimento = true;
    }

    void parado(){
        this.movimento = false;
        this.movimento = movimento;
    }

    void acao(){
        if(this.movimento){
            System.out.println("Estou andando.");
        } else{
            System.out.println("estou parado");
        }
    }

}
