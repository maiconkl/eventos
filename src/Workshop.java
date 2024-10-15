public class Workshop extends Evento {
    String instrutor;
    String cargaHoraria;

    public Workshop(String nome, String data, String local, int capacidadeMaxima, String instrutor, String cargaHoraria) {
        super(nome, data, local, capacidadeMaxima);
        this.instrutor = instrutor;
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String exibirInfo() {
        return super.exibirInfo() + ", Instrutor: " + instrutor + ", Carga Horaria: " + cargaHoraria;
    }
}
