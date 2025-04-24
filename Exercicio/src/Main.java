public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Marcelo", 21, "Masculino");
        p[1] = new Pessoa("Maria", 20, "Feminino");

        l[0] = new Livro("As leis da fisica quantica", "Claudomiro", 650, p[0]);
        l[1] = new Livro("Coisas da life", "Weduardson", 520, p[1]);
        l[2] = new Livro("Testes de bolo", "Marinéia", 200, p[0]);

        l[0].avancarPag();
        l[0].abrir();
        l[0].folhear(649);
        l[0].avancarPag();
        l[0].avancarPag();
        l[0].avancarPag();
        l[0].fechar();
        l[0].detalhes();
    }
}
