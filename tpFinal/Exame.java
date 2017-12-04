package tpFinal;

public class Exame extends Atendimento {
    private String nomeExame;

    public Exame(String nomeExame, String tipoAtendimento, String cliente, Data data, Horario horario) {
        super(tipoAtendimento, cliente, data, horario);
        this.nomeExame = nomeExame;
    }

    public String getNomeExame() {
        return nomeExame;
    }

    public void setNomeExame(String nomeExame) {
        this.nomeExame = nomeExame;
    }
}