package ExemploPratico;

public class ExemploPratico {

    public static void main(String[] args) {
        Conta p1 = new Conta();
        p1.setNumConta(1101);
        p1.abrirConta("cc");
        p1.setTitular("Jubileu");
        p1.depositar(100.0f);
        
        Conta p2 = new Conta();
        p2.setNumConta(1102);
        p2.setTitular("Creuza");
        p2.abrirConta("cp");
        p2.depositar(500.0f);
        p2.sacar(1000.0f);
        p1.sacar(150.0f);
        p1.fecharConta();
        p1.statusConta();
        p2.statusConta();
        
    }
}
