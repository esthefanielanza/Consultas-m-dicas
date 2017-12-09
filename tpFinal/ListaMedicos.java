import java.util.ArrayList;
import java.io.*;

public class ListaMedicos {
	
	private ArrayList<Medico> listaMedicos;

	public ListaMedicos() {
		listaMedicos = new ArrayList<Medico>();
	}

	public void insereMedico(Medico newMedico) {
		System.out.println("Inserindo Medico: " + newMedico.getNome());
		System.out.println("Especialidade: " + newMedico.getEspecialidade());
		listaMedicos.add(newMedico);
	}
	
	public void removeMedico(String nome) {
		for(int i = 0; i < listaMedicos.size(); i++) {
			if(listaMedicos.get(i).getNome() == nome) {
				listaMedicos.remove(i);
			}
		}
	}

	public Medico getMedicoPorIndice(int indice){
		return listaMedicos.get(indice);
	}

	public int getSize(){
		return listaMedicos.size();
	}
	
	public boolean encontraMedico(String nome) {
		for(int i = 0; i < listaMedicos.size(); i++) {
			if(new String(listaMedicos.get(i).getNome()).equals(nome)) {
				System.out.println("Cpf encontrado!\n");
				return true;
			}
		}
		System.out.print("Cpf não encontrado!\n");
		return false;
	}

	public void leMedicosArquivo(File file){

		Medico tmpMedico = new Medico();
		Agenda tmpAgenda = new Agenda();
		Data tmpData;
		Horario tmpHorario;
		int currentField = 0;
		
		try {

			BufferedReader buffer = new BufferedReader(new FileReader(file));
			
	 		String line;
	  		while ((line = buffer.readLine()) != null) {
	  			if(line.equals(",")) {
	  				insereMedico(tmpMedico);
	  				System.out.println(tmpMedico.getAgenda());
	  				tmpMedico = new Medico();
	  			} else if(line.equals("Agenda")){ //Se encontrar a palavra chave "Agenda" lê cada horário de cada dia
	  				int dia;
	  				String[] horarios;
	  				while(!((line = buffer.readLine()).equals("Fim Agenda"))){ //Lê dados da agenda até encontrar "Fim Agenda"
	  					dia = Integer.parseInt((line.split(" "))[1]); //Pega o dia do mês
	  					System.out.println("Dia: " + dia);

	  					tmpData = new Data(dia);

	  					horarios = (buffer.readLine()).split(" "); //Cria um array com os horários do dia
	  					for(int i = 0; i < horarios.length; i++){
	  						tmpHorario = new Horario(horarios[i], true);
	  						tmpData.insereHorario(tmpHorario);
	  					}

	  					tmpAgenda.insereData(tmpData);
	  					tmpMedico.setAgenda(tmpAgenda);
	  					tmpAgenda = new Agenda();

	  				}
	  			} else if(currentField == 0) {
	  				tmpMedico.setNome(line);
	  				currentField++;
	  			} else {
	  				tmpMedico.setEspecialidade(line);
	  				currentField = 0;
	  			}
	  		}
	  		buffer.close();
	  			
	    } catch (Exception e){
	    	System.out.println(e);
	    }
	}
	
	public String toString() {
		return "Número de Medicos cadastrados: " + listaMedicos.size();
	}
	
}