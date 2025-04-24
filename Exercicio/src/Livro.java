public class Livro implements Publicação{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //Metodos
    public void detalhes(){
        System.out.println("--------- Detalhes do Livro --------");
        System.out.println("Titulo do livro: " + this.getTitulo());
        System.out.println("Autor do livro: " + this.getAutor());
        System.out.println("Total de Paginas: " + this.getTotPaginas());
        System.out.println("Pagina atual: " + this.getPagAtual());
        System.out.println("O livro está aberto? " + this.isAberto());
        System.out.println("Quem está lendo? " + this.leitor.getNome());
        System.out.println("-------------------------------------");
    }

    @Override
    public void abrir(){
        if (isAberto()){
            System.out.println("O livro já está aberto!");
        } else {
            setAberto(true);
            System.out.println("Livro foi aberto...");
        }
    }

    @Override
    public void fechar(){
        if (isAberto()){
            setAberto(false);
            System.out.println("Livro foi fechado...");
        } else {
            System.out.println("O livro já está fechado!");
        }
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPaginas) {
            this.pagAtual = 0;
        } else {
            this.pagAtual = p;
            System.out.println("Livro folheado até a página " + p);
        }
    }

    @Override
    public void avancarPag(){
        if (isAberto()){
            this.setPagAtual(this.getPagAtual() + 1);
            if (this.getPagAtual() <= this.getTotPaginas()) {
                System.out.println("Avançado pagina...");
            } else if (this.getPagAtual() == this.getTotPaginas()) {
                System.out.println("Você avançou para a ultima página");
            } else {
                this.setPagAtual(this.getPagAtual() - 1);
                System.out.println("Não é possivel avançar páginas!");
            }
        } else {
            System.out.println("O livro está fechado! Abra para poder avançar");
        }
    }

    @Override
    public void voltarPag(){
        if (isAberto()){
            if (this.getPagAtual() >= 0) {
                this.setPagAtual(this.getPagAtual() - 1);
                System.out.println("Retornado pagina...");
            } else {
                System.out.println("Você está na pagina inicial, não é possivel voltar uma página");
            }
        } else {
            System.out.println("O livro está fechado! Abra para poder voltar");
        }
    }

    //Metodos especias
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.setPagAtual(0);
        this.setAberto(false);
        this.leitor = leitor;
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

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
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
}
