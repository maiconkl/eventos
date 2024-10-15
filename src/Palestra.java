public class Palestra extends Evento {
    private String palestrante;
    private String duracao;
    private String tema;

    public Palestra(String nome, String data, String local, int capacidadeMaxima, 
                    String palestrante, String duracao, String tema) {
        super(nome, data, local, capacidadeMaxima);
        this.palestrante = palestrante;
        this.duracao = duracao;
        this.tema = tema;
    }

    @Override
    public String exibirInfo() {
        String info = "Palestra: " + nome + ", Data: " + data + ", Local: " + local +
               ", Capacidade: " + capacidadeMaxima + ", Palestrante: " + palestrante +
               ", Duração: " + duracao + ", Tema: " + tema;
        info += "\nParticipantes:";
        for (Participante p : participantes) {
            info += "\n" + p.toString();
        }
        return info;
    }
}
