public class Caneta {
    String cor;
    float ponta;
    float carga;
    boolean tampada = false;

    void status(){
        this.cor = cor;
        System.out.println("Esta é uma caneta da cor "+this.cor);

        this.tampada = tampada;
        System.out.println("Está tampada? "+this.tampada);

        this.ponta = ponta;
        System.out.println("Esta ponta é "+this.ponta);

        this.carga = carga;
        System.out.println("A carga é de "+this.carga);
    }

    void rabiscar(){
        if(this.tampada){
            System.out.println("Não posso rabiscar, pois estou tampadX.");
        } else{
            System.out.println("Rabiscando✌.");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }

}
