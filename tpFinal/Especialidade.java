import java.util.LinkedList;

public class Especialidade {
    private LinkedList <Medico> listaMedicos;
    
    public Especialidade() {
        this.listaMedicos = new LinkedList <Medico>();
    }
    
    public void AdicionaMedico(Medico medico){
        listaMedicos.add(medico);
    }

    public LinkedList<Medico> getListaMedicos() {
        return listaMedicos;
    }

    public void setListaMedicos(LinkedList<Medico> listaMedicos) {
        this.listaMedicos = listaMedicos;
    }
}