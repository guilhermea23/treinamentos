package B04;

public class B04 {

    public static void main(String[] args) {
        CanetaGettersSetters c1 = new CanetaGettersSetters("bic",0.7f,true,"amarelo");
        c1.status();
        
        CanetaGettersSetters c2 = new CanetaGettersSetters("rsrs", 0.7f, false, "azul");
        c2.status();
    }

}
