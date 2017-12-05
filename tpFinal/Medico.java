public class Medico {
    private String nome;
    private String especialidade;
//    privateAgenda agenda;
    
    public Medico() {
    	
    }
    
    public Medico(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
//        this.agenda = agenda;
    }  
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

//    public Agenda getAgenda() {
//        return agenda;
//    }
//
//    public void setAgenda(Agenda agenda) {
//        this.agenda = agenda;
//    }
}