public class Palestra extends Evento {
    String palestrante;
    String duracao;

    public Palestra(String nome, String data, String local, int capacidadeMaxima, String palestrante, String duracao) {
        super(nome, data, local, capacidadeMaxima);
        this.palestrante = palestrante;
        this.duracao = duracao;
    }

    @Override
    public String exibirInfo() {
        return super.exibirInfo() + ", Palestrante: " + palestrante + ", Duracao: " + duracao;
    }
}
