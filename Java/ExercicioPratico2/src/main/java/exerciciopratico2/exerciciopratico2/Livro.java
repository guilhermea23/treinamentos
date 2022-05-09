package exerciciopratico2.exerciciopratico2;
public class Livro implements Publicacao {
    private String titulo;    
    private String autor;
    private int totalPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotalPaginas(totalPaginas);
        this.setPagAtual(0);
        this.setAberto(false);
        this.setLeitor(leitor);
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    public void detalhes(){
        System.out.println("Detalhes do Livro de " +this.getAutor());
        System.out.println("Titulo: "+this.getTitulo());
        System.out.println("Total de Páginas: "+ this.getTotalPaginas());
        System.out.println("Quem está com o livro atualmente é o(a) "+this.getLeitor().getNome());
    }

    @Override
    public void abrir() {
        this.setAberto(true);
        System.out.println("Livro Aberto");
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        System.out.println("Livro Fechado");
    }

    @Override
    public void folhear(int p) {
        if (p>this.getTotalPaginas()){
            this.setPagAtual(0);
        }
            this.setPagAtual(p);
            System.out.println("Folheando até a página "+ this.getPagAtual());
    }

    @Override
    public void avancarPagina() {
        System.out.println("Página atual" + this.getPagAtual());
        this.setPagAtual(this.getPagAtual() + 1);
        System.out.println("Página atual" + this.getPagAtual());
    }

    @Override
    public void voltarPagina() {
        System.out.println("Página atual: "+this.getPagAtual());
        this.setPagAtual(this.getPagAtual() - 1);
        System.out.println("Página atual: "+this.getPagAtual());
    }
    
}
