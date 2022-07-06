package UEC;
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }

    
    
    public void apresentar(){
        System.out.println("\t---- DADOS DO LUTADOR ----");
        System.out.println("Lutador: "+this.getNome());
        System.out.println("Nacionalidade: "+this.getNacionalidade());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Altura: "+this.getAltura()+"m");
        System.out.println("Peso: "+this.getPeso()+"kg");
        System.out.println("\t---- ESTATÍSTICAS ----");
        System.out.println("Ganhou: "+this.getVitorias());
        System.out.println("Perdeu: "+this.getDerrotas());
        System.out.println("Empatou: "+this.getEmpates());
        System.out.println("----------------------------------------");
    }
    
    public void status(){
        System.out.println(this.getNome()+ " é um peso "+this.getCategoria()+" tem:");
        System.out.print(this.getVitorias() + " vitórias, ");
        System.out.print(this.getDerrotas() + " derrotas e ");
        System.out.print(this.getEmpates() + " empates.\n\n");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (this.peso<52.2){
            this.categoria = "Inválido";
        } else if (this.peso<=70.3){
            this.categoria = "Leve";
        } else if (this.peso <=83.9){
            this.categoria = "Médio";
        } else if (this.peso <=120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
}
