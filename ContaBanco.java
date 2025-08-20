public class ContaBanco {
    public String numconta;
    protected String tipo;
    private String dono;
    private Float saldo;
    private boolean status = false;

    public void abrirConta(boolean status){
        this.status = true;
    }

    public void fecharConta(boolean status){
        this.status = false;
    }

    public void depositar(){

    }

    public void sacar(){

    }

    public void pagarMensal(){

    }
    
    //atri
//	publico numconta
//	protegido tipo = "CC" ou "CP"
//	privado dono 
//	privado saldo
//	privado status
//Se a conta está aberta o status é verdadeiro.
//Se for uma cc ele ganha 150R$, mas se for cp ele ganha 50R$.
//Para fechar uma conta o saldo não pode estar abaixo de zero ou maior de zero.
//Depositar o status deve estar verdadeiro. E o saque de valor máximo é de 1000R$.
//Quando o método pagarMensal() for chamado, e a conta for CC o valor é de 12R$, mas se for CP o valor é 20R$.
//
//met
//	publico abrirConta()
//	publico fecharConta()
//	publico depositar()
//	publico sacar()
//	publico pagarMensal()
//	getnumConta()
//	setnumConta()
//	getTipo()
//	setTipo()
//	getDono()
//	setDono()
//	getSaldo()
//	setSaldo()
    
}
