public class Atendimento {
    private String tipoAtendimento;
    private String cliente;
    private String data;
    private Horario horario;
    private ListaAtendimento listaAtendimento;
    
    public Atendimento(String tipoAtendimento, String cliente, String data, Horario horario) {
        this.tipoAtendimento = tipoAtendimento;
        this.cliente = cliente;
        this.data = data;
        this.horario = horario;
    }

    public ListaAtendimento getListaAtendimento() {
		return listaAtendimento;
	}

	public void setListaAtendimento(ListaAtendimento listaAtendimento) {
		this.listaAtendimento = listaAtendimento;
	}

	public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(String tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
   
    public void Autorização(){
        
    }  
}