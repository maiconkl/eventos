public class Reserva {
    private Evento Evento;
    
    private int participantesReservados;

    public Reserva(Evento evento) {
        this.Evento = evento;
        this.participantesReservados = 0;
    }

    
    public boolean adicionarReservas(int quantidade) {
        int capacidadeDisponivel = Evento.getCapacidadeMaxima() - Evento.getQuantidadeParticipantes() - participantesReservados;

        if (quantidade <= capacidadeDisponivel) {
            participantesReservados += quantidade;
            System.out.println(quantidade + " reserva(s) adicionada(s). Total de reservas: " + participantesReservados);
            return true;
        } else {
            System.out.println("Não foi possível adicionar: Capacidade máxima atingida.");
            return false;
        }
    }


    public boolean removerReservas(int quantidade) {
        if (participantesReservados >= quantidade) {
            participantesReservados -= quantidade;
            System.out.println(quantidade + " reserva(s) removida(s). Total de reservas: " + participantesReservados);
            return true;
        } else {
            System.out.println("Não foi possível remover: número de reservas insuficiente.");
            return false;
        }
    }

    public void listarReservas() {
        System.out.println("Total de reservas no evento " + Evento.getNome() + ": " + participantesReservados);
    }
}