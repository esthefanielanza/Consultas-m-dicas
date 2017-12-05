public class Consulta extends Atendimento {
    private String medicoEscolhido;
    private String especialidade;

    public Consulta(String medicoEscolhido, String especialidade, String tipoAtendimento, String cliente, Data data, Horario horario) {
        super(tipoAtendimento, cliente, data, horario);
        this.medicoEscolhido = medicoEscolhido;
        this.especialidade = especialidade;
    }

    public String getMedicoEscolhido() {
        return medicoEscolhido;
    }

    public void setMedicoEscolhido(String medicoEscolhido) {
        this.medicoEscolhido = medicoEscolhido;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }
}