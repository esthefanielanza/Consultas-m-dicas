import java.util.LinkedList;

public class Especialidade {

    private String nome;

    private LinkedList <Medico> listaMedicos;
    
    public Especialidade(String nome) {
        this.nome = nome;
        this.listaMedicos = new LinkedList <Medico>();
    }
    
    public void adicionaMedico(Medico medico){
        listaMedicos.add(medico);
        System.out.println("Inserindo médico "+ medico.getNome() + " na especialidade " + this.nome);
    }

    public LinkedList<Medico> getListaMedicos() {
        return listaMedicos;
    }

    public String getNome(){
        return nome;
    }

    public void setListaMedicos(LinkedList<Medico> listaMedicos) {
        this.listaMedicos = listaMedicos;
    }
}