public class Participante {
    private String nome;
    private String email;
    private String tipo; // normal ou VIP
    // Construtor
    public Participante(String nome, String email, String tipo) {
        this.nome = nome;
        this.email = email;
        this.tipo = tipo;
    }
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return "Nome: " + nome + ", Email: " + email + ", Tipo: " + tipo;
    }
}