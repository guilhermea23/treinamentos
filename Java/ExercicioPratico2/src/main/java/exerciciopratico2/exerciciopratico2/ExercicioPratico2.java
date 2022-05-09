package exerciciopratico2.exerciciopratico2;
public class ExercicioPratico2 {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[2];
        
        p[0] = new Pessoa("Pedro", 22,"M");
        p[1] = new Pessoa("Maria", 25,"F");
        
        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("POO para Iniciantes", "Maria Cândido",500,p[1]);
        
        for (int i=0;i<=1;i++){
            l[i].detalhes();
            System.out.println("====================================================================");
        }
    }
}
