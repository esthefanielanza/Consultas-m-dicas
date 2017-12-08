public class ListaAtendimento{
    private Agenda agendaExames;

    public ListaAtendimento(Agenda agendaExames) {
        this.agendaExames = agendaExames;
    }

    public Agenda getAgendaExames() {
        return agendaExames;
    }

    public void setAgendaExames(Agenda agendaExames) {
        this.agendaExames = agendaExames;
    }
}