import java.awt.EventQueue;
import java.io.*;

public class Sistema {

	public static void main(String[] args) {

		File file = new File(System.getProperty("user.dir") + "//medicos"); //Pega o diretório de onde o programa foi inicializado
		File fileClientes = new File(System.getProperty("user.dir") + "//clientes"); //Pega o diretório de onde o programa foi inicializado
		ListaClientes listaClientes = new ListaClientes();
		ListaMedicos listaMedicos = new ListaMedicos();
		ListaEspecialidades listaEspecialidades = new ListaEspecialidades();
		//Agenda agenda = new Agenda();

		listaMedicos.leMedicosArquivo(file);
		listaClientes.leClientesArquivo(fileClientes);
		
		listaEspecialidades.registraEspecialidades(listaMedicos);

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUILogin frame = new GUILogin(listaClientes, listaMedicos, listaEspecialidades);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
