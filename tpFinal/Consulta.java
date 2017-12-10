import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


import javax.swing.JOptionPane;

public class Consulta extends Atendimento {
    private static String medicoEscolhido;
    private static String especialidade;

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

     public static void salvaConsulta() {
        try {
            FileWriter arq;
            arq = new FileWriter("Consultas", true);
            BufferedWriter bw = new BufferedWriter(arq);
            bw.write(medicoEscolhido);
            bw.newLine();
            bw.write(especialidade);
            bw.newLine();
            bw.write(cliente);
            bw.newLine();
            bw.write(data.getDia());
            bw.newLine();
            bw.write(horario.getHora());
            bw.newLine();
            bw.write(",");
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar a consulta!");
        }
    }
}