package ExemploPratico;
public class Conta {
    public int numConta;
    protected String tipo;
    private String titular;
    private float saldo;
    private boolean status;

    public Conta() {
        this.setSaldo(0.0f);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo == "cc") {
            this.setSaldo(50.0f);
        } else {
            this.setSaldo(150.0f);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
        if (this.getSaldo() >0){
            System.out.println("Conta com dinheiro! Saque todo o saldo antes de fechar a conta.");
        } else if (this.getSaldo()<0){
            System.out.println("Conta em débito! Pague canalha!");
        } else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float valor){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo()+valor);
            System.out.println("Deposito realizado com sucesso para " +this.getTitular()+"!");
        } else {
            System.out.println("Impossível depositar!");
        }
    }
    
    public void sacar(float valor){
        if (this.getStatus()){
            if (this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo()-valor);
                System.out.println("Saque realizado com sucesso!");
            }else{
                System.out.println("Saldo Insuficiente para saque!");
            }
        }else{
            System.out.println("Impossível sacar!");
        }
    }
    
    public void pagarMensalidade(){
        float valorM = 0;
        if (this.getTipo() == "cc"){
            valorM = 12;
        }else if (this.getTipo() =="cp"){
            valorM = 20;            
        }
        
        if (this.getStatus()){
            if (this.getSaldo() > valorM){
                this.setSaldo(this.getSaldo()-valorM);
            } else {
                System.out.println("Saldo Insuficiente para pagar mensalidade!");
            }
        } else {
            System.out.println("Impossível pagar!");
        }
    }
    
    public void statusConta(){
        System.out.println("------------------------------------------------------");
        System.out.println("Conta " + this.getNumConta());
        System.out.println("Titular: " + this.getTitular());
        System.out.println("Saldo disponível: " + this.getSaldo());
        System.out.println("A conta está aberta? " + this.getStatus());
    }
}