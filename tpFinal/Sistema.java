import java.awt.EventQueue;
import java.io.*;

public class Sistema {

	public static void main(String[] args) {

		File file = new File(System.getProperty("user.dir") + "//medicos"); //Pega o diretório de onde o programa foi inicializado
		ListaClientes listaClientes = new ListaClientes();
		ListaMedicos listaMedicos = new ListaMedicos();
		Medico tmpMedico = new Medico();
		int currentField = 0;
		
		try {

			BufferedReader buffer = new BufferedReader(new FileReader(file));
			
	 		String line;
	  		while ((line = buffer.readLine()) != null) {
	  			if(line.equals(",")) {
	  				listaMedicos.insereMedico(tmpMedico);
	  			} else if(line.equals("Agenda")){ //Se encontrar a palavra chave "Agenda" lê cada horário de cada dia
	  				int dia;
	  				String[] horarios;
	  				while(!((line = buffer.readLine()).equals("Fim Agenda"))){ //Lê dados da agenda até encontrar "Fim Agenda"
	  					dia = Integer.parseInt((line.split(" "))[1]); //Pega o dia do mês
	  					System.out.println("Dia: " + dia);

	  					horarios = (buffer.readLine()).split(" "); //Cria um array com os horários do dia
	  					for(int i = 0; i < horarios.length; i++){
	  						System.out.print(horarios[i] + " ");
	  					}
	  					System.out.println();

	  				}
	  			} else if(currentField == 0) {
	  				tmpMedico.setNome(line);
	  				currentField++;
	  			} else {
	  				tmpMedico.setEspecialidade(line);
	  				currentField = 0;
	  			}
	  		}
	  			
	    } catch (Exception e){
	    	System.out.println(e);
	    }

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUILogin frame = new GUILogin(listaClientes, listaMedicos);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
