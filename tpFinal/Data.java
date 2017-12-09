import java.util.ArrayList;

public class Data {
    private int diaDoMes;
    private ArrayList<Horario> listaHorarios;
    
    public Data() {
        listaHorarios = new ArrayList<Horario>();
    }

    public Data(int dia) {
    	this();
        diaDoMes = dia;
    }

    public int getDia(){
        return diaDoMes;
    }

    public void setDia(int dia){
        diaDoMes = dia;
    }
    
    public ArrayList<Horario> getListaHorarios() {
		return listaHorarios;
	}


	public void insereHorario(Horario horario){
        listaHorarios.add(horario);
        System.out.println(horario.getHora() + " inserido no dia " + diaDoMes);
    }
    
    
}